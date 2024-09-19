package com.onboarding.test.zoloz.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EmploymentInformation {

    private String employerName;
    private String employmentType;
    private String jobTitle;
    private String salary;

}
