package com.prodian.SpringBootApp.Dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import com.prodian.SpringBootApp.Entity.Profile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	
	 @OneToOne(targetEntity = Profile.class, cascade = CascadeType.ALL)
		
     private  Profile profile;
}
