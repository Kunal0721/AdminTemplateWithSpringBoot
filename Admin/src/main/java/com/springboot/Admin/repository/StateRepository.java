package com.springboot.Admin.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Admin.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
