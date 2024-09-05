package com.onboarding.test.zoloz.model;

import org.springframework.data.annotation.Id;

import java.util.List;


public  class FileRecord {
    @Id
    private int id;
    private List<String> filenames;
}
