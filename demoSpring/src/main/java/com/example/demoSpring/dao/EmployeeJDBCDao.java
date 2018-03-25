package com.example.demoSpring.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.demoSpring.model.Employee;

public interface EmployeeJDBCDao {
	
	List<Employee> findEmployeesByBand(String band);
}
