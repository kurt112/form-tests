package com.onboarding.test.zoloz.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Relationships {

    private List<String> additionalInformation;
    private List<String> applicantInformation;
    private List<String> auditTrail;
    private List<String> complianceInformation;
    private List<String> creditInformation;
    private List<String> decisionInformation;
    private List<String> errorInformation;
    private List<String> financialInformation;
    private List<String> integrationInformation;
    private List<String> metadata;
    private List<String> notificationInformation;
    private List<String> originatingSystemInformation;
    private List<String> referralInformation;
    private List<String> reportingInformation;
    private List<String> scoringInformation;
    private List<String> securityInformation;
    private List<String> statusInformation;
    private List<String> supportingDocuments;
}
