package com.springboot.Admin.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Admin.model.VehicleType;

@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}
