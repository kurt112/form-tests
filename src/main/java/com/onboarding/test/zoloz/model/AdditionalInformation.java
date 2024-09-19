
package com.onboarding.test.zoloz.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AdditionalInformation {

    private String comments;
    private String nameToAppearOnCard;
    private String preferedCardDeliveryAddress;
    private String preferredCurrency;
    private String preferredLanguage;

}
