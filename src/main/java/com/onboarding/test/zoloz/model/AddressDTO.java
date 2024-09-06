package com.onboarding.test.zoloz.model;

import lombok.*;

@Builder
@Getter
@Setter
@ToString
public class AddressDTO {
    String tenDigitPsgc;
    String name;
    String correspondenceCode;
    String geographicLevel;
    String oldName;
    String cityClass;
    String incomeClassification;
    String urbanRural;
    String status;

}
