
package com.onboarding.test.zoloz.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SecurityMeasure {

    private String description;
    private String measure;
}
