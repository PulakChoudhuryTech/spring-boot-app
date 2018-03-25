package com.example.demoSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoSpring.model.EmployeeJobProfile;

public interface EmployeeOrgRepository extends JpaRepository<EmployeeJobProfile, String>{

}
