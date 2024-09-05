package com.onboarding.test.zoloz.controller;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

@RestController
@RequiredArgsConstructor
@RequestMapping("files")
public class FileUploadController {

    @PostMapping("/upload")
    public ResponseEntity<HashMap<String, Object>> uploadId(@RequestParam("file") MultipartFile [] files) throws IOException {

        System.out.println("the files");

        final HashMap<String, Object> hashMap = new HashMap<>();

        for(MultipartFile file : files){
            System.out.println(file.getOriginalFilename());
            file.transferTo(new File(Objects.requireNonNull(file.getOriginalFilename())));
        }

        // sdk
        // mag up load s3

        hashMap.put("message", "File Upload Successful");
        return new ResponseEntity<>(hashMap, HttpStatus.OK);
    }
}
