package com.java.project;

public class Register extends UserDAO {
	private int id;
	private String name;
	private String password;
	private int phone;
	private String adresse;
	private String job;
	public Register(int id, String name,String password, int phone, String adresse, String job) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.adresse = adresse;
		this.job = job;
	}
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	

}
