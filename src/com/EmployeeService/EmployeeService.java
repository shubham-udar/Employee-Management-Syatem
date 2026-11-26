package com.EmployeeService;

import java.sql.SQLException;
import java.util.ArrayList;

import com.EmployeEntity.Employee;
import com.EmployeeException.SomethingWentWrongException;
import com.Employeedao.EmployeeDao;
import com.Exception.EmployeeNotFoundException;
import com.Exception.EmployeeNullException;
import com.Exception.EmployeesNotFoundException;
import com.Exception.IncorrectQueryException;

public class EmployeeService {
  
	EmployeeDao dao = new EmployeeDao();
	
	public String createTable()
	{
		String message =dao.createTable();
		
		if(message == null)
		{
			throw new IncorrectQueryException("Check Your Sql Query..");
		}
		
		return message;
	}
	
	
	public String InsertEmployee(Employee employee)
	{
		String message =dao.insertEmployee(employee);
		
		if(employee == null)
		{
			throw new EmployeeNullException("Enter Employee Data  Proper ");
		}
		
		return message;
	}
	
	
	public String updateEmployee(Employee employee)
	{
		String message = dao.updateEmployee(employee);
		
		if(message == null)
		{
			throw new SomethingWentWrongException("Check Your Sql Query");
		}
		
		return message;
	}
	
	public String deleteEmployee(int EmpId) throws SQLException
	{
		String message = dao.deleteEmployee(EmpId);
		
		
		if(message == null)
		{
			throw new SQLException("EmpId Not Exist..");
		}
		
		return  message;
	}
	
	public Employee getEmployeeById(int EmpId) 
	{
		Employee employee =dao.getEmployeeById(EmpId);
		
		if(employee == null)
		{
			throw new EmployeeNotFoundException("Employee Not Found With Id : "+EmpId);
		}
		return employee;
	}
	
	public ArrayList<Employee> getAllEmployees()
	{
		ArrayList<Employee> emp =dao.getAllEmployees();
		
		if(emp.isEmpty())
		{
			throw new EmployeesNotFoundException("No Employees Present  In Database..");
		}
		
		return emp;
	}
}
