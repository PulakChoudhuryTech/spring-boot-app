package com.example.demoSpring.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ExternalSourceAuthSettings {

	String connectionString;
	
	@Column(name="url")
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
}
