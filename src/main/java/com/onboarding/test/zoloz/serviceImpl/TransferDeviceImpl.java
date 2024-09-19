package com.onboarding.test.zoloz.serviceImpl;

import com.onboarding.test.zoloz.service.JwtService;
import com.onboarding.test.zoloz.service.ServiceFactory;
import com.onboarding.test.zoloz.service.TransferDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Optional;

@Service
public class TransferDeviceImpl implements TransferDeviceService {

    private final JwtService jwtService;

    @Autowired
    public TransferDeviceImpl(ServiceFactory serviceFactory) {
        this.jwtService = serviceFactory.getJwtService();
    }

    @Override
    @Cacheable(value = "transfer-device-token", key = "#orn")
    public Optional<String> createTransferDeviceToken(String orn) {


        String token = jwtService.generateTokenTransferDevice(orn);


//        TransferDeviceTokenDTO transferDeviceTokenDTO = TransferDeviceTokenDTO
//                .builder()
//                .id(UUID.randomUUID().toString())
//                .token(UUID.randomUUID().toString())
//                .createdOn(new Date())
//                .expires(calendar.getTime())
//                .build();


        InetAddress IP= null;
        try {
            IP = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

        System.out.println(IP);

        return  Optional.of(token);
    }

    @Override
    public Optional<String> createSourceOfApplicationToken(String origin, int selectedCard) {
        String token = jwtService.generateSourceOfApplicationToken(origin,selectedCard);

        return Optional.of(token);
    }

}
