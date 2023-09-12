package com.springboot.Admin.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Admin.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
