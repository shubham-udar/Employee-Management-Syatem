package com.EmployeeController;

import java.sql.SQLException;
import java.util.ArrayList;

import com.EmployeEntity.Employee;
import com.EmployeeService.EmployeeService;

public class EmployeeController {
   
	EmployeeService service = new EmployeeService();
	
	public String createTable()
	{
		return service.createTable();
	}
	
	public String insertEmployee(Employee employee)
	{
		 String message =service.InsertEmployee(employee);
		 
		 return message;
	}
	
	public String updateEmployee(Employee employee)
	{
		String message = service.updateEmployee(employee);
		
		return message;
	}
	
	
	public String deleteEmployee(int EmpId) throws SQLException
	{
		String message = service.deleteEmployee(EmpId);
		
		return message;
	}
	
	public Employee getEmployeeById(int EmpId) 
	{
		 Employee employee = service.getEmployeeById(EmpId);
		 return employee;
	}
	
	public ArrayList<Employee> getAllEmployees()
	{
		ArrayList<Employee> emp =service.getAllEmployees();
		
		return emp;
	}
}
