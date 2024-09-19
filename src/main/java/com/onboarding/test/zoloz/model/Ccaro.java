
package com.onboarding.test.zoloz.model;

import com.onboarding.test.zoloz.enums.SourceOfApplicationEnum;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class Ccaro {

    private ApplicantInformation applicantInformation;
    private String applicationId;
    private String orn;
    private String productType;
    private Relationships relationships;
    private SourceOfApplicationEnum sourceOfApplication;

}
