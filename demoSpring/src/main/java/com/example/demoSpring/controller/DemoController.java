package com.example.demoSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSpring.model.Employee;
import com.example.demoSpring.service.EmployeeService;

@RestController
public class DemoController {
	
	@Autowired
	EmployeeService empService;
	
	@RequestMapping(value = "/test/{name}")
	public String greeting(@PathVariable("name") String name) {
		return "Hello world1" + name;
	}
	
	@RequestMapping(value = "/employee/add", method = RequestMethod.POST)
	public String addEmployee(@RequestBody Employee emp) {
		empService.addEmployee(emp);
		return emp.getName();
	}
	
	@RequestMapping(value = "/employee")
	public List<Employee> getEmployee() {
		return empService.getAllEmployees();
	}
}
