package com.onboarding.test.zoloz.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@ComponentScan("com.onboarding.test.zoloz.service")
@RequiredArgsConstructor
public class ServiceFactory {
    private final AddressService addressService;
    private final JwtService jwtService;
    private final ReferralCodeService referralCodeService;
}
