package com.onboarding.test.zoloz.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Metadata {

    private String creationDate;
    private String lastModifiedDate;

}