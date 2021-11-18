package com.prodian.EmployeeTask.Pojo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonalDetails {
	private String name;
	private long age;
	private Date dateOfBirth;

}
