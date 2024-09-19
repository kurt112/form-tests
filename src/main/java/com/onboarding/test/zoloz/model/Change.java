
package com.onboarding.test.zoloz.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Change {

    private String changeDate;
    private String changedBy;
    private String field;
    private String newValue;
    private String oldValue;
    

}