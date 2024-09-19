package com.onboarding.test.zoloz.service;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface TransferDeviceService {

    Optional<String> createTransferDeviceToken(String Orn);

    Optional<String> createSourceOfApplicationToken(String origin, int selectedCard);
}
