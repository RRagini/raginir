package com;

public class Employee {
	private int id;
	private String name;
	private String email;
	private String technology;
	/*public Employee(int id, String name, String email, String technology) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.technology = technology;
	}*/
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}

}
