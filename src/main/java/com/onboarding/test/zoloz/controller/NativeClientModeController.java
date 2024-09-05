package com.onboarding.test.zoloz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Use annotation to expose endpoints for the client application to consume
@RestController
//Define the common base path for the API endpoints
@RequestMapping(value = {"/webapi"})
public class NativeClientModeController {
    String clientId = "<Client ID>";
    String zolozPublicKey = "<ZOLOZ's public key content encoded in base64>";
    String merchantPrivateKey = "<The merchant's private key content encoded in base64>";

}