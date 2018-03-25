package com.example.demoSpring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSpring.dao.EmployeeOrgRepository;
import com.example.demoSpring.dao.EmployeeRepository;
import com.example.demoSpring.model.Employee;
import com.example.demoSpring.model.EmployeeJobProfile;

@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	EmployeeOrgRepository empOrgRepository;
	
	public void addEmployee(Employee emp) {
		employeeRepository.save(emp);
	}
	
	public void addEmployeeDetails(Employee empDetail) {
		employeeRepository.save(empDetail);
	}
	
	public ArrayList<Employee> getAllEmployees() {
		return (ArrayList<Employee>) employeeRepository.findAll();
	}
	
	public Optional<Employee> getEmployeeById(String eid) {
		return employeeRepository.findById(eid);
	}
	
	public void addEmployeeJobProfile(EmployeeJobProfile empJob) {
		empOrgRepository.save(empJob);
	}
}
