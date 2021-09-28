package com.prodian.SpringBootApp.Dto;

import java.io.Serializable;

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
	

}
