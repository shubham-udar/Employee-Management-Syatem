package com.Employeedao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.EmployeEntity.Employee;
import com.jdbcConnection.JDBCUtil;


public class EmployeeDao {
	
//	 Database Code
	
  Connection con =  JDBCUtil.createConnection();
  
//   saveEmployee 
  
  public String createTable()
  {
	  try
	  {
		 PreparedStatement st = con.prepareStatement("create table employees (EmpId int , EmpName varchar(45),EmpSalary double,Department varchar(45))");
		 
	     int value = st.executeUpdate();
	     
	     if(value > 0)
	     {
	    	 return "Table Created";
	     }
		 
//		 System.out.println("Table created...");
		  
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  
	  return null;
  }
  
  

//  ReComendaded 
  
  
  public String insertEmployee(Employee employee)
  {
	  try
	  {
		  
////	   Statement st = con.createStatement();
		  
	 PreparedStatement pst=  con.prepareStatement("insert into employees values (?,?,?,?)");
	  
	 pst.setInt(1, employee.getEmpId());
	 
	 pst.setString(2, employee.getEmpName());
	 
	 pst.setDouble(3, employee.getEmpSalary());
 
	 pst.setString(4, employee.getEmpDepartment());
	   
	 pst.execute();
	   
//	   System.out.println("Data Inserted SucessFully....");
	  
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	    
	  
	  return " Employee Inserted Sucessfully";
	 
 }
  
 
 // update Employee
  
  
  public String updateEmployee(Employee employee)
  {
	  
	  try
	  {
		  
	    PreparedStatement statement =  con.prepareStatement("update employees set EmpName =?,EmpSalary=?,Department=? where EmpId=?");
	    
	    statement.setString(1, employee.getEmpName());
	    
	    statement.setDouble(2,employee.getEmpSalary());
	    
	    statement.setString(3,employee.getEmpDepartment());
	   
	    statement.setInt(4, employee.getEmpId());
	    
	    int value =  statement.executeUpdate();
	    
	    if(value > 0)
	    {
	    	 return "Employee Update SucessFylly...";
	    }
	  
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  
	  return null;
  }
  
//  Delete Employee
  
  public String deleteEmployee(int EmpId)
  {
	  
	 try
	 {
		
	 PreparedStatement statement = con.prepareStatement("delete from employees where EmpId=?");
	 
	 statement.setInt(1, EmpId);
	 
	 int value = statement.executeUpdate();
	 
	 if(value > 0)
	 {
		 return "Employee Deleted SucessFully...";
	 }
	 
	 
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 
	 return null;
	 
  }
  
  public Employee getEmployeeById(int EmpId)
  {
	  
	  Employee employee = null;
	  
	  try
	  {
		  
	    PreparedStatement statement= con.prepareStatement("select * from employees where EmpId=?");
	    
	    statement.setInt(1,EmpId);
	    
	    ResultSet result =  statement.executeQuery();
	   
	    
	    while(result.next())
	    {	
		   
	    int id= result.getInt("EmpId");
	    String Name = result.getString("EmpName");
	    double Salary =  result.getDouble("EmpSalary");
	    String Department =  result.getString("Department");
	   
	    employee = new Employee(id,Name,Salary,Department);
	   
	    }
	   
	 
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  
	  return employee ;
  }
  
  
  public ArrayList<Employee> getAllEmployees()
  {
	    
	  ArrayList<Employee> emp = new ArrayList<Employee>();
	  Employee employee = null;
	  
	  try
	  {
		  
	   PreparedStatement statement= con.prepareStatement("select * from employees");
	   ResultSet result =  statement.executeQuery();
	   
	   while(result.next())
	   {
		  int id = result.getInt("EmpId");
		  String Name=  result.getString("EmpName");
		  double Salary =  result.getDouble("EmpSalary");
		  String Department =   result.getString("Department");
		  
		  employee = new Employee(id,Name,Salary,Department);
		  
		  emp.add(employee);
	   }
	  
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  
	  
	  return emp;
  }
  
  
     
  
  
}
