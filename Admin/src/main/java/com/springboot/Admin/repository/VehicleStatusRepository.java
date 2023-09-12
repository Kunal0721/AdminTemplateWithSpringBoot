package com.springboot.Admin.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Admin.model.VehicleStatus;

@Repository
public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {

}
