
package com.onboarding.test.zoloz.model;


import com.onboarding.test.zoloz.enums.SourceOfApplicationEnum;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Source {

    private String description;
    private SourceOfApplicationEnum sourceOfApplication;

}
