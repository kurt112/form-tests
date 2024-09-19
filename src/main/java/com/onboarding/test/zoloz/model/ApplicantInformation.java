
package com.onboarding.test.zoloz.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ApplicantInformation {

    private String address;
    private String barangay;
    private String city;
    private ContactInformation contactInformation;
    private String firstname;
    private String lastname;
    private String zipCode;

}