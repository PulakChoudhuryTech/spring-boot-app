package com.example.demoSpring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSpring.model.Employee;
import com.example.demoSpring.model.EmployeeJobProfile;
import com.example.demoSpring.model.EmployeeSkills;
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
		EmployeeSkills empskills = emp.getEmpSkills();
		empskills.setSkillset(empskills.getSkillset());
		empskills.setExperience(empskills.getExperience());
		emp.setEmpSkills(empskills);
		empService.addEmployee(emp);
		return emp.getName();
	}
	
	@RequestMapping(value = "/employee/details", method = RequestMethod.POST)
	public String addEmployeeDetails(@RequestBody Employee empDetails) {
		empService.addEmployeeDetails(empDetails);
		return "Success";
	}
	
	@RequestMapping(value = "/employee")
	public ArrayList<Employee> getEmployee() {
		return empService.getAllEmployees();
	}
	
	@RequestMapping(value = "/employee/{eid}")
	public Optional<Employee> getEmployeeById(@PathVariable("eid") String eid) {
		return empService.getEmployeeById(eid);
	}
	
	@RequestMapping(value = "/employee/jobprofile", method = RequestMethod.POST)
	public String addEmployeeDetails(@RequestBody EmployeeJobProfile empJob) {
		empService.addEmployeeJobProfile(empJob);
		return "Success";
	}
	
}
