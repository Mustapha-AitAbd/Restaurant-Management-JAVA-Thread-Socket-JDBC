package com.java.project;

public class User extends UserDAO {
	private int id;
	private String name;
	private String password;
	private String job;
	
	public User() {}
	public User(String name, String password, String job) {
		super();
		this.name = name;
		this.password = password;
		this.job = job;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	
}
