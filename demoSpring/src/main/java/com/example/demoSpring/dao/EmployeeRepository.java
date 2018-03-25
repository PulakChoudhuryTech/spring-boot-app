package com.example.demoSpring.dao;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demoSpring.model.Employee;
import com.example.demoSpring.model.EmployeeJobProfile;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
	
	
	@Query("select new com.example.demoSpring.dao.EmployeeObjectMapper(u.name, u.age, u.empSkills, u.employeejob) from Employee u where u.eid = :eid")
	EmployeeObjectMapper findByEid(@Param("eid") String eid);
	
	@Query("select u from Employee u where u.eid = :eid")
	Employee findEmpByEid(@Param("eid") String eid);
	
	@Query("select u from Employee u inner join com.example.demoSpring.model.EmployeeJobProfile b on b.band = :band and b.eid=u.eid")
//	@Query("select u from Employee u where u.eid = ?1")
	ArrayList<Employee> findEmpByBand(@Param("band") String band);

}
