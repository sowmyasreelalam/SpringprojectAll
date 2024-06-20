package com.jsp.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class Employee {
	@Id
	private int id;
	private String name;
	private String designtion;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesigntion() {
		return designtion;
	}
	public void setDesigntion(String designtion) {
		this.designtion = designtion;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


}
