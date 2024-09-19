package com.onboarding.test.zoloz.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ReferralCode{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String  id;
    private String mobileNumber;
    private String cardNumber;
    private String code;
    private String dateGeneratedOn;
    private String expirationDate;
    private Boolean isValid;
}



