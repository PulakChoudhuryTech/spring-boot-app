package com.example.demoSpring.dao;

import com.example.demoSpring.model.EmployeeJobProfile;
import com.example.demoSpring.model.EmployeeSkills;

public class EmployeeObjectMapper {
	
	String name;
	int age;
	EmployeeSkills empSkills;
//	EmployeeJobProfile employeejob;
	
	public EmployeeSkills getEmpSkills() {
		return empSkills;
	}

	public void setEmpSkills(EmployeeSkills empSkills) {
		this.empSkills = empSkills;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public EmployeeObjectMapper(String name, int age, EmployeeSkills empSkills, EmployeeJobProfile employeejob) {
		this.name = name;
		this.age = age;
		this.empSkills = empSkills;
//		this.employeejob = employeejob;
	}
}
