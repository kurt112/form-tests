package com.onboarding.test.zoloz.service;

import com.onboarding.test.zoloz.model.Address;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {

    List<Address> getAllProvince();

    List<Address> getAllCity();

    List<Address> getAllBarangay();

    List<Address> getAllRegion();

    List<Address> getAllCityByRegionCode(final String regionCode);

    List<Address> getAllProvinceByCityCode(final String cityCode);

    List<Address> getAllBarangayByProvinceCode(final String provinceCode);


    void save(Address address);
}
