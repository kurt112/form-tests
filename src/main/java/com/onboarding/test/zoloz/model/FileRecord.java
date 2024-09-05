package com.onboarding.test.zoloz.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;


public  class FileRecord {
    @Id
    private int id;
    private List<String> filenames;
}
