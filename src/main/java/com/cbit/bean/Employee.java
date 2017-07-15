package com.cbit.bean;

public class Employee {
	private int empId;
	private String empName;
	private String empAddress;
	private double empSalary;
	private String empDept;
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public String getEmpDept() {
		return empDept;
	}
	
}
