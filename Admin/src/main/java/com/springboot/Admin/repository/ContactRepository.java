package com.springboot.Admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Admin.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
