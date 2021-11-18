package com.prodian.MyPractice.Entity;

public class Employee {

	private long empid;
	private String empName;
	private long salary;

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Employee(long empid, String empName, long salary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
	}

	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", salary=" + salary + "]";
	}

}
