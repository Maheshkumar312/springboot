package com.prodian.EmployeeTask.Pojo;


public class Employee {

	private long empId;
	private PersonalDetails pDetails;
	private EmploymentDetails eDetails;

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public PersonalDetails getpDetails() {
		return pDetails;
	}

	public void setpDetails(PersonalDetails pDetails) {
		this.pDetails = pDetails;
	}

	public EmploymentDetails geteDetails() {
		return eDetails;
	}

	public void seteDetails(EmploymentDetails eDetails) {
		this.eDetails = eDetails;
	}

	public Employee(long empId, PersonalDetails pDetails, EmploymentDetails eDetails) {
		super();
		this.empId = empId;
		this.pDetails = pDetails;
		this.eDetails = eDetails;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", pDetails=" + pDetails + ", eDetails=" + eDetails + "]";
	}

}