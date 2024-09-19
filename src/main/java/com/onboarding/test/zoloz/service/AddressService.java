package com.onboarding.test.zoloz.service;

import com.onboarding.test.zoloz.model.Address;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public interface AddressService {

    List<Address> getAllProvince();

    List<Address> getAllCity();

    Flux<Address> getAllBarangay();

    Flux<Address> getAllRegion();

    List<Address> getProvinceByCode(final String provinceCode);

    List<Address> getMunicipalitiesInProvince(final String provinceCode);

    List<Address> getSingleMunicipalityByCodeInProvince(final String municipalityCode,final String provinceCode);

    List<Address> getAllBarangaysInMunicipality(final String municipalityCode,final String provinceCode);

    List<Address> getSingleBarangayInMunicipality(final String municipalityCode,final String provinceCode, final String barangayCode);


    void save(Address address);
}
