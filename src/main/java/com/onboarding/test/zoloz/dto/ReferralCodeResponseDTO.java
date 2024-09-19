package com.onboarding.test.zoloz.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class ReferralCodeResponseDTO extends PropertyNamingStrategies.SnakeCaseStrategy {
    private String mobileNumber;
    private String cardNumber;
    private String referralCode;
    private String dateGeneratedOn;
    private String expirationDate;
    private boolean isValid;
}
