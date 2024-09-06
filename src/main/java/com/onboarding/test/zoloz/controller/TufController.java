package com.onboarding.test.zoloz.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.onboarding.test.zoloz.model.Tuf;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("tuf")
@CrossOrigin("*")
@RequiredArgsConstructor
public class TufController {


    private final ResourceLoader resourceLoader;

    @GetMapping
    @Cacheable(value = "getTufData")
    public ResponseEntity<Object> response () throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Resource resource = resourceLoader.getResource("classpath:json/tuf.json");

        Tuf tuf = mapper.readValue(resource.getFile(), Tuf.class);

        return new ResponseEntity<>(tuf, HttpStatus.OK);
    }
}
