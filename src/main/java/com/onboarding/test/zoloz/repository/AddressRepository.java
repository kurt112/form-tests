package com.onboarding.test.zoloz.repository;

import com.onboarding.test.zoloz.model.Address;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface AddressRepository extends JpaRepository<Address, Integer> {

    @Query("select t from Address t where t.geographicLevel='Prov'")
    List<Address> getAllProvince();

    @Query("select t from Address t where t.geographicLevel='Mun'")
    List<Address> getAllMunicipality();

    @Query("select t from Address t where t.geographicLevel='Reg'")
    List<Address> getAllRegion();

    @Query("select t from Address t where t.geographicLevel='Bgy'")
    List<Address> getAllBarangay();

    @Query("select t from Address t where t.geographicLevel='Mun' and t.regionCode=?1")
    List<Address> getAllCityByRegionCode(final String regionCode);

    @Query("select t from Address t where t.geographicLevel='Prov' and t.cityCode=?1")
    List<Address> getAllProvinceByCityCode(final String cityCode);

    @Query("select t from Address t where t.geographicLevel='Bgy' and t.provinceCode=?1")
    List<Address> getAllBarangayByProvinceCode(final String provinceCode);

}
