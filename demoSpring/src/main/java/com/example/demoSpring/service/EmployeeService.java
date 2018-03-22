package com.example.demoSpring.service;

import java.util.ArrayList;

import com.example.demoSpring.model.Employee;

public interface EmployeeService {
	
	ArrayList<Employee> getAllEmployees();

	void addEmployee(Employee emp);
}
