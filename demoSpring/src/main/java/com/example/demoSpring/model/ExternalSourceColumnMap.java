package com.example.demoSpring.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name="M_SOURCE_MAP")
public class ExternalSourceColumnMap {

	String actual_name;
	String target_name;
	String map_by;
	String resp_type;
	Integer m_source_id;
	@Autowired
	ExternalSourceAuthSettings authSetting;
	@Embedded
	public ExternalSourceAuthSettings getAuthSetting() {
		return authSetting;
	}
	public void setAuthSetting(ExternalSourceAuthSettings authSetting) {
		this.authSetting = authSetting;
	}
	public String getActual_name() {
		return actual_name;
	}
	public void setActual_name(String actual_name) {
		this.actual_name = actual_name;
	}
	public String getTarget_name() {
		return target_name;
	}
	public void setTarget_name(String target_name) {
		this.target_name = target_name;
	}
	public String getMap_by() {
		return map_by;
	}
	public void setMap_by(String map_by) {
		this.map_by = map_by;
	}
	public String getResp_type() {
		return resp_type;
	}
	public void setResp_type(String resp_type) {
		this.resp_type = resp_type;
	}
	@Id
	public Integer getM_source_id() {
		return m_source_id;
	}
	public void setM_source_id(Integer m_source_id) {
		this.m_source_id = m_source_id;
	}
	
	
	
}
