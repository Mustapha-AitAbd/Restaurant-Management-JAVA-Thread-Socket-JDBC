package com.java.project;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mysql.clients;
public class UserDAO {
	public void addOne(Register p) {
		try {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			java.sql.Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","ouhassiP352615");
			String req =" insert into users (ID, NAME, PASSWORD, PHONE,ADRESSE,JOB)"
					+"values (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(req);
			ps.setInt(1, p.getId());
			ps.setString(2, p.getName());
			ps.setString(3, p.getPassword());
			ps.setInt(4, p.getPhone());
			ps.setString(5, p.getAdresse());
			ps.setString(6, p.getJob());
			ps.executeQuery();
			con.close();	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.print("vous aver réussie a ajouter un users");
	}
	public User getOne(User p) {
		User pers = null;		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");   
			java.sql.Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","ouhassiP352615");
			String req = "SELECT * FROM users where NAME=? AND PASSWORD=?";
			PreparedStatement ps = con.prepareStatement(req);
			ps.setString(1,p.getName());
			ps.setString(2,p.getPassword());
			ResultSet res = ps.executeQuery();
			if(res.next()) {
				pers=new User (res.getString("NAME"), res.getString("PASSWORD"),res.getString("JOB"));
				
			}
			con.close();
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("NOM :"+pers.getName());
		
		return pers;
	}
	}


