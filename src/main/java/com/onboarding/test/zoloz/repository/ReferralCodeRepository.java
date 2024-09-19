package com.onboarding.test.zoloz.repository;


import com.onboarding.test.zoloz.model.ReferralCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ReferralCodeRepository extends JpaRepository<ReferralCode, Long> {

    @Query("select t from ReferralCode t where t.code='?1'")
    Optional<ReferralCode> findByReferralCode(String referral_code);
}
