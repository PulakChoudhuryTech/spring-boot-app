package com.example.demoSpring.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee_job_profile")
public class EmployeeJobProfile {
	
	String designation;
	String eid;
	String band;
	int salary;
	
//	Employee emp;
//	
//	@OneToOne(mappedBy="employeejob", cascade=CascadeType.ALL)
//	public Employee getEmp() {
//		return emp;
//	}
//	public void setEmp(Employee emp) {
//		this.emp = emp;
//	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Id
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
