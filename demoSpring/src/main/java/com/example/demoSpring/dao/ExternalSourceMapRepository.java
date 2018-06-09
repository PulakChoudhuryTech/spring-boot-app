package com.example.demoSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoSpring.model.ExternalSourceColumnMap;

public interface ExternalSourceMapRepository extends JpaRepository<ExternalSourceColumnMap, Integer>  {

}
