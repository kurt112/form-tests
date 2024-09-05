package com.onboarding.test.zoloz.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/forms")
@RequiredArgsConstructor
@CrossOrigin("*")
public class FormsController {

    private final ResourceLoader resourceLoader;

    @GetMapping("/basic-details")
    public JSONObject getBasicDetails() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:forms/basic-details.json");
        ObjectMapper mapper = new ObjectMapper();


        return mapper.readValue(resource.getInputStream(), JSONObject.class);
    }


}
