package com.example.demoSpring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demoSpring.model.Employee;

@Repository("EmployeeJdbcRepo")
public class EmployeeJDBCImpl implements EmployeeJDBCDao {
	
	public JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Employee> findEmployeesByBand(String band) {
		System.out.println(band);
		String SQL = "select u.band, b.name from EMPLOYEE b inner join EMPLOYEE_JOB_PROFILE u on u.band = '" + band + "' and u.eid=b.eid";
		System.out.println(SQL);
		return (ArrayList<Employee>) jdbcTemplate.query(SQL, new EmployeeMapper());
	}
}
