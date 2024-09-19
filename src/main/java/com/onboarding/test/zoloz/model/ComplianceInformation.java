
package com.onboarding.test.zoloz.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ComplianceInformation {

    private List<Requirement> requirements;

}
