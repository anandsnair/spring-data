package edu.springboot.databasedemo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {

	@Id
	private int lId;
	private String lName;
	
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.MERGE,mappedBy="laptop")
	private Student student;
	
	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
}
