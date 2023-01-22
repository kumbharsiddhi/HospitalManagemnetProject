package com.Springboot.data.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="DoctLogin")
public class DoctorLogin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	//@Column(name="id")
	private long id;
	//@Column(name="Usernamename")
	private String Username;
	//@Column(name="Password")
	private String Password;
	
	public DoctorLogin()
	{
	}
	public DoctorLogin(String Username, String Password) {
		super();
		this.Username = Username;
		this.Password = Password;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String Username) {
		this.Username = Username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}
	
}
	
	
	
