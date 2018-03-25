package com.example.demoSpring.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demoSpring.model.EmployeeJobProfile;

@Transactional
public interface EmployeeOrgRepository extends CrudRepository<EmployeeJobProfile, String>{
	
//	@Query("select p from employee_job_profile p where p.eid = 123")
//	ArrayList<EmployeeJobProfile> findEmpByBand(@Param("band") String band);
}
