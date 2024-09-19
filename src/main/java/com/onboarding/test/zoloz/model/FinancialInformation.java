package com.onboarding.test.zoloz.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FinancialInformation {

    private String assets;
    private String expenses;
    private String income;
    private String liabilities;
}