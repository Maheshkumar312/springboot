package com.prodian.SpringBootApp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Profile")
public class EmployeeProfile {
	
	@Id
		private String designation;

		@Column(name = "salary")
		private String salary;
		
		@Column(name = "location")
		private String location;
}
