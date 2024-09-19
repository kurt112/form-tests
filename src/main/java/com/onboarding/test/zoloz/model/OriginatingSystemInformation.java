package com.onboarding.test.zoloz.model;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class OriginatingSystemInformation {

    private String description;
    private String system;

}