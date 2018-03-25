package com.example.demoSpring.model;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeSkills {
	
	String skillset;
	int experience;

	public String getSkillset() {
		return skillset;
	}
	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
}
