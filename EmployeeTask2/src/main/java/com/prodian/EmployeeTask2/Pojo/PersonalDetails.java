package com.prodian.EmployeeTask2.Pojo;

import java.util.Date;

public class PersonalDetails {

	private String name;
	private long age;
	private Date dob;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public PersonalDetails(String name, long age, Date dob) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
	}

	public PersonalDetails() {
		super();
	}

	@Override
	public String toString() {
		return "PersonalDetails [name=" + name + ", age=" + age + ", dob=" + dob + "]";
	}

}
