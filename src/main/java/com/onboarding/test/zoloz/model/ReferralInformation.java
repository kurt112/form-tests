
package com.onboarding.test.zoloz.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ReferralInformation {

    private List<Source> sources;
}
