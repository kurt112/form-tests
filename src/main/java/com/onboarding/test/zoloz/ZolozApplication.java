package com.onboarding.test.zoloz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.*;
import java.util.HashMap;

@SpringBootApplication(exclude = {R2dbcAutoConfiguration.class})
@RestController
@EnableCaching
public class ZolozApplication {


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

    @Cacheable(value = "commonDetails")
    public String getCommonDetails()  {
        return "wew";
    }

    @GetMapping("test")
    public ResponseEntity<HashMap<String, Object>> test() {
        final HashMap<String, Object> test = new HashMap<>();


        return new ResponseEntity<>(test, HttpStatus.OK);
    }

}
