package com.onboarding.test.zoloz.controller;


import com.onboarding.test.zoloz.model.Address;
import com.onboarding.test.zoloz.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;

@RequestMapping("/addresses")
@RestController
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @GetMapping("/regions")
    public Flux<Address> getAllRegion() {

        return addressService.getAllRegion();
    }

    @GetMapping("/provinces")
    public ResponseEntity<List<Address>> getAllProvince() {

        return new ResponseEntity<>(addressService.getAllProvince(), HttpStatus.OK);
    }

    @GetMapping("/municipalities")
    public ResponseEntity<List<Address>> getAllMunicipality() {

        return new ResponseEntity<>(addressService.getAllCity(), HttpStatus.OK);
    }

    @GetMapping(value = "/barangays", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Address> getAllBarangay() {

        return this.addressService.getAllBarangay()
                .delaySequence(Duration.ofSeconds(1));
    }

    @GetMapping("/provinces/{province-code}")
    public ResponseEntity<List<Address>> getProvinceByCode(@PathVariable("province-code") final String code) {

        return new ResponseEntity<>(addressService.getProvinceByCode(code), HttpStatus.OK);
    }

    @GetMapping("/provinces/{province-code}/municipalities")
    public ResponseEntity<List<Address>> getMunicipalitiesInProvince(@PathVariable("province-code") final String provinceCode) {

        return new ResponseEntity<>(addressService.getMunicipalitiesInProvince(provinceCode), HttpStatus.OK);
    }

    @GetMapping("/provinces/{province-code}/municipalities/{municipality-code}")
    public ResponseEntity<List<Address>> getSingleMunicipalityByCodeInProvince(
            @PathVariable("province-code") final String provinceCode,
            @PathVariable("municipality-code") final String municipalityCode) {

        return new ResponseEntity<>(addressService.getSingleMunicipalityByCodeInProvince(municipalityCode, provinceCode), HttpStatus.OK);
    }

    @GetMapping("/provinces/{province-code}/municipalities/{municipality-code}/barangays")
    public ResponseEntity<List<Address>> getAllBarangaysInMunicipality(
            @PathVariable("province-code") final String provinceCode,
            @PathVariable("municipality-code") final String municipalityCode) {

        return new ResponseEntity<>(addressService.getAllBarangaysInMunicipality(municipalityCode,provinceCode), HttpStatus.OK);
    }

    @GetMapping("/provinces/{province-code}/municipalities/{municipality-code}/barangays/{barangay-code}")
    public ResponseEntity<List<Address>> getSingleBarangayInMunicipality(
            @PathVariable("province-code") final String provinceCode,
            @PathVariable("municipality-code") final String municipalityCode,
            @PathVariable("barangay-code") final String barangayCode) {

        return new ResponseEntity<>(addressService.getSingleBarangayInMunicipality(municipalityCode, provinceCode,barangayCode), HttpStatus.OK);
    }

}
