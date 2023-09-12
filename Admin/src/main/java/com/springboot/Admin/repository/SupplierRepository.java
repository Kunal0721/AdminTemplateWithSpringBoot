package com.springboot.Admin.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Admin.model.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
