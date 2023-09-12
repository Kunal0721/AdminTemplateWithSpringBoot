package com.springboot.Admin.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Admin.model.JobTitle;

@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
