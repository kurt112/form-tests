
package com.onboarding.test.zoloz.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DecisionInformation {
    private String approvalStatus;
    private String declineReason;
}