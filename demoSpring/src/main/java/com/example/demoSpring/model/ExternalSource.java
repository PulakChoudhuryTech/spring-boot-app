package com.example.demoSpring.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name="d_metric_source")
public class ExternalSource implements Serializable {
	
	private static final long serialVersionUID = -441924052369731685L;

	String source_name;
	String source_def;
	Integer m_source_id;
	
	ExternalSourceColumnMap columnMap;
	
	public String getSource_name() {
		return source_name;
	}
	public void setSource_name(String source_name) {
		this.source_name = source_name;
	}
	@Column(name="source_definition")
	public String getSource_def() {
		return source_def;
	}
	public void setSource_def(String source_def) {
		this.source_def = source_def;
	}
	@Id
	public Integer getM_source_id() {
		return m_source_id;
	}
	public void setM_source_id(Integer m_source_id) {
		this.m_source_id = m_source_id;
	}
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="m_source_id")
	public ExternalSourceColumnMap getColumnMap() {
		return columnMap;
	}
	public void setColumnMap(ExternalSourceColumnMap columnMap) {
		this.columnMap = columnMap;
	}
	
	
}
