package com.onboarding.test.zoloz.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
