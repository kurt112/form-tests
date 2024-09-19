package com.onboarding.test.zoloz.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Requirement {
    private String description;
    private String requirement;
}