package com.spring.core;

public class Employee {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Setting ID");
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Seeting name");
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
