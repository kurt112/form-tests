package com.onboarding.test.zoloz.serviceImpl;

import com.onboarding.test.zoloz.model.Address;
import com.onboarding.test.zoloz.repository.AddressRepository;
import com.onboarding.test.zoloz.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AddressServiceImpl implements AddressService {

    @Value("${spring.page.size}")
    private int sizePerPage;

    private final AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<Address> getAllProvince() {

        return this.addressRepository.getAllProvince();
    }


    @Override
    public List<Address> getAllCity() {
        return this.addressRepository.getAllMunicipality();
    }

    @Override
    public List<Address> getAllBarangay() {
        return this.addressRepository.getAllBarangay();
    }

    @Override
    public List<Address> getAllRegion() {
        return this.addressRepository.getAllRegion();
    }

    @Override
    public List<Address> getAllCityByRegionCode(String regionCode) {
        return this.addressRepository.getAllCityByRegionCode(regionCode);
    }

    @Override
    public List<Address> getAllProvinceByCityCode(String cityCode) {
        return this.addressRepository.getAllProvinceByCityCode(cityCode);
    }

    @Override
    public List<Address> getAllBarangayByProvinceCode(String provinceCode) {
        return this.addressRepository.getAllBarangayByProvinceCode(provinceCode);
    }

    @Override
    public void save(Address address) {
        addressRepository.save(address);
    }
}
