package com.onboarding.test.zoloz.enums;

// NOTE: This util is for Excel Address Data xlsx located in classpath//address/addressData.xlsx
public enum  ExcelAddress {
    TEN_DIGIT_PSGC(0),
    NAME(1),
    CORRESPONDENCE_CODE(2),
    GEOGRAPHIC_LEVEL(3),
    OLD_NAME(4),
    CITY_CLASS(5),
    INCOME_CLASSIFICATION(6),
    URBAN_RURAL(7),
    STATUS(8),
    REGION_LAST_INDEX(1),
    PROVINCE_CODE_LAST_INDEX(4),
    MUNICIPALITY_LAST_INDEX(6),
    BARANGAY_LAST_INDEX(9);
    private int value;
    ExcelAddress(int i) {
        this.value = i;
    }

    public int getValue(){
        return this.value;
    }
}
