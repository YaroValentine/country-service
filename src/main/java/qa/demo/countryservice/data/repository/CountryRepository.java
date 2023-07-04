package qa.demo.countryservice.data.repository;

import org.springframework.data.repository.CrudRepository;
import qa.demo.countryservice.data.entity.CountryEntity;

import java.util.UUID;

public interface CountryRepository extends CrudRepository<CountryEntity, UUID> {

    CountryEntity getByCountryName(String name);

    CountryEntity getByCountryCode(String name);


}
