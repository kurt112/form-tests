
package com.onboarding.test.zoloz.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ContactInformation {

    private AdditionalInformation additionalInformation;
    private AuditTrail auditTrail;
    private CreditInformation creditInformation;
    private DecisionInformation decisionInformation;
    private String email;
    private EmergencyContact emergencyContact;
    private EmploymentInformation employmentInformation;
    private ErrorInformation errorInformation;
    private FinancialInformation financialInformation;
    private Metadata metadata;
    private String phone;
    private List<Reference> references;
    private SocialMedia socialMedia;
    private StatusInformation statusInformation;
    private SupportingDocuments supportingDocuments;
    private String website;

}
