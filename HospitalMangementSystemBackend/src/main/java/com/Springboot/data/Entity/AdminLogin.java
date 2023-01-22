package com.Springboot.data.Entity;


	import jakarta.persistence.Entity;
	import jakarta.persistence.Column;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;


	@Entity
	@Table(name="AdmLogin")
	public class AdminLogin { 
		
		@Id
		@Column(name="id")
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		
		@Column(name="Username")
		private String Username;
		@Column(name="Password")
		private String Password;
		
		public AdminLogin()
		{
		}
		public AdminLogin(String Username, String Password  ) {
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
		public void setUsername(String name) {
			this.Username = name;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String Password) {
			this.Password = Password;
		}
		
	}

