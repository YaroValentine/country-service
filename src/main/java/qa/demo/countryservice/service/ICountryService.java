package qa.demo.countryservice.service;

import qa.demo.countryservice.domain.Country;

import java.util.List;

public interface ICountryService {

    Country getCountry();

    String getCountryNameByCode(String countryCode);

    List<Country> getAllCountries();

}
