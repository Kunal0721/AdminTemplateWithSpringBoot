package com.springboot.Admin.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Admin.model.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer>{

}
