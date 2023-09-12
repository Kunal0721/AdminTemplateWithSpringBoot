package com.springboot.Admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Admin.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
