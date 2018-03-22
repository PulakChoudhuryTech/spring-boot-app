package com.example.demoSpring.service;

import java.util.ArrayList;
import java.util.List;

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
	
	public ArrayList<Employee> getAllEmployees() {
		return (ArrayList<Employee>) employeeRepository.findAll();
	}
	
	public String getEmployeeById() {
		return null;
	}
}
