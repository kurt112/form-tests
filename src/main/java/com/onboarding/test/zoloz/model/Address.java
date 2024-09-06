package com.onboarding.test.zoloz.model;

import jakarta.persistence.*;
import lombok.*;

@Table
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String code;

    private String regionCode;
    private String provinceCode;
    private String cityCode;
    private String barangayCode;
    private String name;
    private String geographicLevel;
}
