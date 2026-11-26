package com.EmployeEntity;

public class Employee {
	
	
	private int EmpId;
	
	private String EmpName;
	
	private double EmpSalary;
	
	private String EmpDepartment;

	
	
	public Employee(int empId, String empName, double empSalary, String empDepartment) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpSalary = empSalary;
		EmpDepartment = empDepartment;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public double getEmpSalary() {
		return EmpSalary;
	}

	public void setEmpSalary(double empSalary) {
		EmpSalary = empSalary;
	}

	public String getEmpDepartment() {
		return EmpDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		EmpDepartment = empDepartment;
	}
	
	
	

}
