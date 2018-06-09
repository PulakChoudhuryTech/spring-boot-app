package com.example.demoSpring.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoSpring.model.ExternalSource;

public interface ExternalSourceRepository extends JpaRepository<ExternalSource, Integer> {

}
