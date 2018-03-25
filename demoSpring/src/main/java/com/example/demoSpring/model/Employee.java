package com.example.demoSpring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="employee")
@SecondaryTable(name="employee_details")
public class Employee implements Serializable {
	
	private static final long serialVersionUID = -5522528479911436547L;
	
	String eid;
	String name;
	int age;
	String email;
	String address;
	int contact;
	
	EmployeeSkills empSkills;
	
	@Embedded
	public EmployeeSkills getEmpSkills() {
		return empSkills;
	}
	public void setEmpSkills(EmployeeSkills empSkills) {
		this.empSkills = empSkills;
	}
	@Column(table="employee_details")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(table="employee_details")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(table="employee_details")
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	@Id
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
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
}
