
package com.onboarding.test.zoloz.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class AuditTrail {

    private List<Change> changes;

}
