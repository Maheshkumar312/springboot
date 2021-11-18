package com.prodian.EmployeeTask2.Pojo;

public class Employee {
	private long empId;
	private PersonalDetails personal_details;
	private EmployeeDetails employee_details;

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public PersonalDetails getPersonal_details() {
		return personal_details;
	}

	public void setPersonal_details(PersonalDetails personal_details) {
		this.personal_details = personal_details;
	}

	public EmployeeDetails getEmployee_details() {
		return employee_details;
	}

	public void setEmployee_details(EmployeeDetails employee_details) {
		this.employee_details = employee_details;
	}

	public Employee(long empId, PersonalDetails personal_details, EmployeeDetails employee_details) {
		super();
		this.empId = empId;
		this.personal_details = personal_details;
		this.employee_details = employee_details;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", personal_details=" + personal_details + ", employee_details="
				+ employee_details + "]";
	}

}
