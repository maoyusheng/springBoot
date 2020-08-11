package com.hqyj.spring_Boot2.modules.test.service;

import com.hqyj.spring_Boot2.modules.test.entity.Country;

public interface CountryService {

    Country getCountryByCountryId(int countryId);

    Country getCountryByCountryName(String countryName);
}
