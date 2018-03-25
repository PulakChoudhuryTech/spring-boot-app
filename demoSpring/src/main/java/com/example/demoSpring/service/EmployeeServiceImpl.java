package com.example.demoSpring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSpring.dao.EmployeeRepository;
import com.example.demoSpring.model.Employee;

@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public void addEmployee(Employee emp) {
		employeeRepository.save(emp);
	}
	
	public void addEmployeeDetails(Employee empDetail) {
		employeeRepository.save(empDetail);
	}
	
	public ArrayList<Employee> getAllEmployees() {
		return (ArrayList<Employee>) employeeRepository.findAll();
	}
	
//	public ArrayList<Employee> getFullEmployeeDetails() {
//		return employeeRepository.findAllEmployeeFullDetails();
//	}
	
	public Optional<Employee> getEmployeeById(String eid) {
		return employeeRepository.findByEid(eid);
	}
}
