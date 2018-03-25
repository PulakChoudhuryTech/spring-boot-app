package com.example.demoSpring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import com.example.demoSpring.model.Employee;
import com.example.demoSpring.model.EmployeeJobProfile;

public interface EmployeeService {
	
	ArrayList<Employee> getAllEmployees();

	void addEmployee(Employee emp);
	
	Optional<Employee> getEmployeeById(String eid);

	void addEmployeeDetails(Employee empDetails);

	void addEmployeeJobProfile(EmployeeJobProfile empJob);	
}
