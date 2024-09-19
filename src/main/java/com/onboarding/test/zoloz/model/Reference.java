package com.onboarding.test.zoloz.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Reference {

    private String name;
    private String phone;
    private String relationship;

}