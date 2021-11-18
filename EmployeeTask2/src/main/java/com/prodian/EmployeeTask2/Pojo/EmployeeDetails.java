package com.prodian.EmployeeTask2.Pojo;

import java.util.Date;

public class EmployeeDetails {
	private Date dateOfJoining;
	private long salary;

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public EmployeeDetails(Date dateOfJoining, long salary) {
		super();
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
	}

	public EmployeeDetails() {
		super();
	}

	@Override
	public String toString() {
		return "EmployeeDetails [dateOfJoining=" + dateOfJoining + ", salary=" + salary + "]";
	}

}
