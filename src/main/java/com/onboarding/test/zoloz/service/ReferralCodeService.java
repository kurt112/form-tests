package com.onboarding.test.zoloz.service;

import com.onboarding.test.zoloz.model.ReferralCode;
import org.springframework.stereotype.Service;

@Service
public interface ReferralCodeService {
    ReferralCode validateReferralCode(final String referralCode);
}
