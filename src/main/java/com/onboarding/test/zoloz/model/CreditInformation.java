
package com.onboarding.test.zoloz.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreditInformation {

    private String creditInquiries;
    private String creditReport;
    private String creditScore;

}