package com.onboarding.test.zoloz.serviceImpl;


import com.onboarding.test.zoloz.model.ReferralCode;
import com.onboarding.test.zoloz.repository.AddressRepository;
import com.onboarding.test.zoloz.repository.ReferralCodeRepository;
import com.onboarding.test.zoloz.repository.RepositoryFactory;
import com.onboarding.test.zoloz.service.ReferralCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service

public class ReferralCodeServiceImpl implements ReferralCodeService {

    private final ReferralCodeRepository referralCodeRepository;
    private final AddressRepository addressRepository;

    @Autowired
    public ReferralCodeServiceImpl(final RepositoryFactory repositoryFactory) {
        this.referralCodeRepository = repositoryFactory.getReferralCodeRepository();
        this.addressRepository   = repositoryFactory.getAddressRepository();
    }

    @Cacheable
    @Override
    public ReferralCode validateReferralCode(String referralCode) {

        if(referralCode.equals("valid")){
            return ReferralCode
                    .builder()
                    .mobileNumber("")
                    .cardNumber("")
                    .code(referralCode)
                    .dateGeneratedOn(new Date().toString())
                    .expirationDate(new Date().toString())
                    .isValid(true)
                    .build();
        }

        return ReferralCode
                .builder()
                .mobileNumber("")
                .cardNumber("")
                .code(referralCode)
                .dateGeneratedOn(new Date().toString())
                .expirationDate(new Date().toString())
                .isValid(false)
                .build();
    }
}
