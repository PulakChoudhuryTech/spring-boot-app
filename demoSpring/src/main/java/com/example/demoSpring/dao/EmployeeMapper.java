package com.example.demoSpring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demoSpring.model.Employee;
import com.example.demoSpring.model.EmployeeJobProfile;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeMapper implements RowMapper {
	
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		ObjectMapper mapper = new ObjectMapper();
	    mapper.setSerializationInclusion(Include.NON_NULL);
		Employee emp = new Employee();
		EmployeeJobProfile jp= new EmployeeJobProfile();
		jp.setBand(rs.getString("band"));
		emp.setName(rs.getString("name"));
		emp.setEmployeejob(jp);
		return emp;
	}
}
