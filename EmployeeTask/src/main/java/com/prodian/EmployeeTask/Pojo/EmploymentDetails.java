package com.prodian.EmployeeTask.Pojo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmploymentDetails {
	private Date dateOfJoining;
	private String salary;

}
