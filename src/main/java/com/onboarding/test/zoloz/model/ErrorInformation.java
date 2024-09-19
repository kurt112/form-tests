package com.onboarding.test.zoloz.model;

import lombok.Builder;
import lombok.Data;

import java.lang.Error;
import java.util.List;

@Builder
@Data
public class ErrorInformation {

    private ComplianceInformation complianceInformation;
    private CustomFields customFields;
    private List<Error> errors;
    private IntegrationInformation integrationInformation;
    private NotificationInformation notificationInformation;
    private OriginatingSystemInformation originatingSystemInformation;
    private ReferralInformation referralInformation;
    private ReportingInformation reportingInformation;
    private ScoringInformation scoringInformation;
    private SecurityInformation securityInformation;

}
