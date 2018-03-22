package com.example.demoSpring.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demoSpring.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

}
