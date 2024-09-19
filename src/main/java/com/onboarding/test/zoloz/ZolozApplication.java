package com.onboarding.test.zoloz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.security.*;
import java.util.HashMap;
import java.util.concurrent.Executors;

@SpringBootApplication(exclude = {R2dbcAutoConfiguration.class})
@RestController
@EnableCaching
public class ZolozApplication {
    @Value("${spring.datasource.maximum-pool-size}")
    private int connectionPoolSize;


    public static void main(String[] args) throws NoSuchAlgorithmException {

        SpringApplication.run(ZolozApplication.class, args);

//        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
//
//        SecureRandom secureRandom = new SecureRandom();
//        keyPairGenerator.initialize(2048, secureRandom);
//
//        KeyPair keyPair = keyPairGenerator.generateKeyPair();
//        Key publicKey = keyPair.getPublic();
//        Key privateKey = keyPair.getPrivate();
//
//        String publicKeyBase64 = Base64.getEncoder().encodeToString(publicKey.getEncoded());
//        String privateKeyBase64 = Base64.getEncoder().encodeToString(privateKey.getEncoded());
//
//        System.out.println(publicKeyBase64);
//        System.out.println("the private key");
//        System.out.printf(privateKeyBase64);



    }
    @Bean
    public Scheduler jdbcScheduler() {
        return Schedulers.fromExecutor(Executors.newFixedThreadPool(connectionPoolSize));
    }

    @Bean
    public TransactionTemplate transactionTemplate(PlatformTransactionManager transactionManager) {
        return new TransactionTemplate(transactionManager);
    }
}
