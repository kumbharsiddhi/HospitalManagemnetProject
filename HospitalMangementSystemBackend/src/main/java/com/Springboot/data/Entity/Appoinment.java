package com.Springboot.data.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




	

	@Entity
	@Table(name="appoinment")
	public class Appoinment {
		
		@Id
		private long id;
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		@Column(name="name")
		private String name;
		@Column(name="age")
		private String age;
		@Column(name="symptoms")
		private String symptoms;
		@Column(name="number")
		private String number;
		
		public Appoinment() {
			
		}
		
		public Appoinment(String name, String age, String symptoms, String number) {
			//super();
			this.name = name;
			this.age = age;
			this.symptoms = symptoms;
			this.number = number;
		}
		public Appoinment(long id, String name, String age, String symptoms, String number) {
			//super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.symptoms = symptoms;
			this.number = number;
		}

		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getSymptoms() {
			return symptoms;
		}
		public void setSymptoms(String symptoms) {
			this.symptoms = symptoms;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
	}


