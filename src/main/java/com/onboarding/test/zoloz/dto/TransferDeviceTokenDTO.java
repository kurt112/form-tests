package com.onboarding.test.zoloz.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Builder
@Data
public class TransferDeviceTokenDTO {

    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String token;

    @CreationTimestamp
    private Date createdOn;

    private Date expires;
}
