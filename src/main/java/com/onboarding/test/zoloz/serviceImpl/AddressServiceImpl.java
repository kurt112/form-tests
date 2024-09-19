package com.onboarding.test.zoloz.serviceImpl;


import com.onboarding.test.zoloz.model.Address;
import com.onboarding.test.zoloz.repository.AddressRepository;
import com.onboarding.test.zoloz.repository.RepositoryFactory;
import com.onboarding.test.zoloz.service.AddressService;
import com.onboarding.test.zoloz.util.AddressUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Scheduler;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Value("${spring.page.size}")
    private int sizePerPage;

    @Qualifier("jdbcScheduler")
    private final Scheduler jdbcScheduler;

    private final AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(final Scheduler jdbcScheduler, final RepositoryFactory repositoryFactory) {
        this.jdbcScheduler = jdbcScheduler;
        this.addressRepository = repositoryFactory.getAddressRepository();
    }

    @Override
    public List<Address> getAllProvince() {

        return this.addressRepository.getAddress(null, AddressUtil.PROVINCE);
    }


    @Override
    public List<Address> getAllCity() {
        return this.addressRepository.getAddress(null, AddressUtil.MUNICIPALITY);
    }

    @Override
    @Transactional
    public Flux<Address> getAllBarangay() {
        Pageable pageable = PageRequest.of(1, 100);

        Flux<Address> defer = Flux.defer(() -> Flux.fromIterable(this.addressRepository.findAll()));
        return defer.subscribeOn(jdbcScheduler);
    }

    @Override
    public Flux<Address> getAllRegion() {
        return Flux.defer(() -> Flux.fromIterable(this.addressRepository.getAddress(null, AddressUtil.REGION)));
    }

    @Override
    public List<Address> getProvinceByCode(final String provinceCode) {
        return this.addressRepository.getProvinceByCode(null, AddressUtil.PROVINCE, provinceCode);
    }

    @Override
    public List<Address> getMunicipalitiesInProvince(final String provinceCode) {
        return this.addressRepository.getMunicipalitiesInProvince(null, AddressUtil.MUNICIPALITY, provinceCode);
    }

    @Override
    public List<Address> getSingleMunicipalityByCodeInProvince(final String municipalityCode, final String provinceCode) {
        return this.addressRepository.getSingleMunicipalityByCodeInProvince(null, AddressUtil.MUNICIPALITY, municipalityCode, provinceCode);
    }

    @Override
    public List<Address> getAllBarangaysInMunicipality(final String municipalityCode, final String provinceCode) {
        return this.addressRepository.getAllBarangaysInMunicipality(null, AddressUtil.BARANGAY, municipalityCode, provinceCode);
    }

    @Override
    public List<Address> getSingleBarangayInMunicipality(final String municipalityCode, final String provinceCode, final String barangayCode) {
        return this.addressRepository.getSingleBarangayInMunicipality(null, AddressUtil.BARANGAY, municipalityCode, provinceCode, barangayCode);
    }


    @Override
    public void save(Address address) {
        addressRepository.save(address);
    }
}
