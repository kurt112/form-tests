package com.onboarding.test.zoloz.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SupportingDocuments {

    private String addressProof;
    private String idProof;
    private String incomeProof;

}
