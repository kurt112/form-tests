package com.onboarding.test.zoloz.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class StatusInformation {

    private String reason;
    private String status;

}