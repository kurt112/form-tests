package com.onboarding.test.zoloz.repository;


import com.onboarding.test.zoloz.model.Address;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

    @Query("select t from Address t where t.geographicLevel=?1")
    List<Address> getAddress(Pageable pageable, final String geographicLevel);

    @Query("select t from Address t where t.geographicLevel=?1 and t.provinceCode=?2")
    List<Address> getProvinceByCode(Pageable pageable, final String geographicLevel, final String provinceCode);

    @Query("select t from Address t where t.geographicLevel=?1 and t.provinceCode=?2")
    List<Address> getMunicipalitiesInProvince(Pageable pageable, final String geographicLevel, final String provinceCode);

    @Query("select t from Address t where t.geographicLevel=?1 and t.provinceCode=?3 and t.cityCode=?2")
    List<Address> getSingleMunicipalityByCodeInProvince(Pageable pageable, final String geographicLevel, final String municipalityCode, final String provinceCode);

    @Query("select t from Address t where t.geographicLevel=?1 and t.provinceCode=?3 and t.cityCode=?2")
    List<Address> getAllBarangaysInMunicipality(Pageable pageable, final String geographicLevel, final String municipalityCode, final String provinceCode);

    @Query("select t from Address t where t.geographicLevel=?1 and t.provinceCode=?3 and t.cityCode=?2 and t.barangayCode=?4")
    List<Address> getSingleBarangayInMunicipality(Pageable pageable, final String geographicLevel, final String municipalityCode,final String provinceCode, final String barangayCode);

}
