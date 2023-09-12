package com.springboot.Admin.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Admin.model.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
