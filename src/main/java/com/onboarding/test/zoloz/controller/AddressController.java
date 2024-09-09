package com.onboarding.test.zoloz.controller;


import com.onboarding.test.zoloz.model.Address;
import com.onboarding.test.zoloz.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/addresses")
@RestController
public class AddressController {

    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/regions")
    public ResponseEntity<List<Address>> getAllRegion() {

        return new ResponseEntity<>(addressService.getAllRegion(), HttpStatus.OK);
    }

    @GetMapping("/provinces")
    public ResponseEntity<List<Address>> getAllProvince() {

        return new ResponseEntity<>(addressService.getAllProvince(), HttpStatus.OK);
    }

    @GetMapping("/municipalities")
    public ResponseEntity<List<Address>> getAllMunicipality() {

        return new ResponseEntity<>(addressService.getAllCity(), HttpStatus.OK);
    }

    @GetMapping("/barangays")
    public ResponseEntity<List<Address>> getAllBarangay() {

        return new ResponseEntity<>(addressService.getAllBarangay(), HttpStatus.OK);
    }

    @GetMapping("/municipalities/{region-code}")
    public ResponseEntity<List<Address>> getAllCityByRegionCode(@PathVariable("region-code") final String regionCode) {

        return new ResponseEntity<>(addressService.getAllCityByRegionCode(regionCode), HttpStatus.OK);
    }

    @GetMapping("/provinces/{city-code}")
    public ResponseEntity<List<Address>> getAllProvinceByCityCode(@PathVariable("city-code") final String cityCode) {

        return new ResponseEntity<>(addressService.getAllProvinceByCityCode(cityCode), HttpStatus.OK);
    }

    @GetMapping("/barangays/{province-code}")
    public ResponseEntity<List<Address>> getAllBarangayByCityCode(@PathVariable("province-code") final String provinceCode) {

        return new ResponseEntity<>(addressService.getAllBarangayByProvinceCode(provinceCode), HttpStatus.OK);
    }

//    @GetMapping("/provinces/{provinces-id}/municipalities/{municipality-id}/barangays/{barangay-id}")
//    public ResponseEntity<List<Address>> findProvincesById


}
