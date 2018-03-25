package com.example.demoSpring.dao;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demoSpring.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String> {
	
	
	@Query("select u from Employee u where u.eid = :eid")
	Optional<Employee> findByEid(@Param("eid") String eid);
	
//	@Query("select e.name, e.age, e.address, e.contact, e.email from employee e join employee_details ed on e.eid = ed.eid")
//	ArrayList<Employee> findAllEmployees();
	
	

}
