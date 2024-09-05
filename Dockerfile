#FROM eclipse-temurin:17-jdk-focal
#
#WORKDIR /app
#
#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#RUN chmod +x ./mvnw dependency:go-offline
#
#COPY src ./src
#
#CMD ["./mvnw", "spring-boot:run"]

# Use an official Maven image as the base image
FROM maven:3.8.5-openjdk-17 AS build
# Set the working directory in the container
WORKDIR /mvn
# Copy the pom.xml and the project files to the container
COPY pom.xml .
COPY src ./src
# Build the application using Maven
RUN mvn clean package -DskipTests

#CMD ["ls"]
# Use an official OpenJDK image as the base image
FROM eclipse-temurin:17-jdk-focal
## Set the working directory in the container
WORKDIR /app
# Copy the built JAR file from the previous stage to the container
COPY /mvn/target/zoloz-0.0.1-SNAPSHOT.jar /app/target/app.jar
# Set the command to run the application
CMD ["java", "-jar", "app.jar"]