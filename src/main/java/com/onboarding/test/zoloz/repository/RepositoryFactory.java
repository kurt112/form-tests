package com.onboarding.test.zoloz.repository;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@RequiredArgsConstructor
@Getter
@EnableJpaRepositories("com.onboarding.test.zoloz.repository")
public class RepositoryFactory {
    private final AddressRepository addressRepository;
    private final ReferralCodeRepository referralCodeRepository;
    private final FileRecordRepository fileRecordRepository;
}