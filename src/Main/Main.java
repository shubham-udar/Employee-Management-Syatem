package Main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.EmployeEntity.Employee;
import com.EmployeeController.EmployeeController;
import com.EmployeeException.SomethingWentWrongException;

public class Main {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		EmployeeController controller = new EmployeeController();
		
		int id;
		String Name;
		double Salary;
		String department;
		
		
//		
//		String message =controller.createTable();
//		
//		System.out.println(message);
		
		
//		Employee e = new Employee(id,Name,Salary,department);
//	    String message =	controller.insertEmployee(e);
//	    
//	    System.out.println(message); 
		
	
		/*try
		{
		Employee employee =new Employee(104,"Parvin",50000,"BA");
		
	    String message = controller.updateEmployee(employee);
	    
	    System.out.println(message);
		
		}catch(SomethingWentWrongException message)
		{
//		     System.out.println(message.getMessage());
			 message.printStackTrace();
		} */
		
		
	/*	try
		{
			
		String message = controller.deleteEmployee(103);
		System.out.println(message);
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}  */
		
		 /*   try 
		    {
		    	
			Employee employee =controller.getEmployeeById(106);
			System.out.println("Employee Id         : "+employee.getEmpId());
			System.out.println("Employee Name       : "+employee.getEmpName());
			System.out.println("Employee Salary     : "+employee.getEmpSalary());
			System.out.println("Employee Department : "+employee.getEmpDepartment());
			
		    }catch(Exception e)
		    {
		    	System.out.println(e.getMessage());
		    }   */
		
//		try
//		{
//		    ArrayList<Employee> employee =	controller.getAllEmployees();
//		    
//		    for(Employee emp : employee) {
//			System.out.println("Employee Id         : "+emp.getEmpId());
//			System.out.println("Employee Name       : "+emp.getEmpName());
//			System.out.println("Employee Salary     : "+emp.getEmpSalary());
//			System.out.println("Employee Department : "+emp.getEmpDepartment());
//			
//			System.out.println("*********************************");
//			
//		    }
//		}catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//		}  
		
		
		while(true)
		{
			System.out.println("1 . Insert Employee ");
			System.out.println("2 . Update Employee ");
			System.out.println("3 . Delete Employee By Id ");
			System.out.println("4 . get Employee By Id ");
			System.out.println("5 . get All Employee ");
			System.out.println("6 . Exit ");
			
			System.out.println("Enter Your Choice ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 :
				
				try
				{
				
				System.out.println("Enter Employee Id :");
				id=sc.nextInt();
				
				System.out.println("Enter Employee Name :");
				Name = sc.next();
				
				System.out.println("Enter Employee Salary :");
				Salary = sc.nextDouble();
				
				System.out.println("Enter Employee Department :");
				department = sc.next();
				
				
				Employee e = new Employee(id,Name,Salary,department);
				
			    String message =	controller.insertEmployee(e);
			    
			    System.out.println(message); 
			    
				}catch(Exception e1)
				{
					e1.printStackTrace();
				}
			    
			    break;
			    
			case 2 :
				   
				try
				{
					
					System.out.println("Enter Employee Id To Update Employee :");
					id=sc.nextInt();
					
					System.out.println("Enter Employee Name :");
					Name = sc.next();
					
					System.out.println("Enter Employee Salary :");
					Salary = sc.nextDouble();
					
					System.out.println("Enter Employee Department :");
					department = sc.next();
				    
					Employee employee =new Employee(id,Name,Salary,department);
				
			        String message1 = controller.updateEmployee(employee);
			    
			        System.out.println(message1);
				
				}catch(SomethingWentWrongException message1)
				{
//				     System.out.println(message.getMessage());
					 message1.printStackTrace();
				}
				
				break;
				
				
			case 3 :
				
				try
				{
			    
				System.out.println("Enter Employee Id to Delete Employee :");
				id=sc.nextInt();
				String message2 = controller.deleteEmployee(id);
				System.out.println(message2);
				
				}catch(Exception ee)
				{
					System.out.println(ee.getMessage());
				}  
				
				
				break;
				
			case 4 :
				
				 try 
				    {
					 System.out.println("Enter Employee Id To get  Employee :");
					 id=sc.nextInt();
					Employee employee =controller.getEmployeeById(id);
					System.out.println("Employee Id         : "+employee.getEmpId());
					System.out.println("Employee Name       : "+employee.getEmpName());
					System.out.println("Employee Salary     : "+employee.getEmpSalary());
					System.out.println("Employee Department : "+employee.getEmpDepartment());
					
					System.out.println();
					
				    }catch(Exception eee)
				    {
				    	System.out.println(eee.getMessage());
				    }   
				 
				 break;
				 
			case 5 :
				
				
				try
				{
				    ArrayList<Employee> employee =	controller.getAllEmployees();
				    
				    for(Employee emp : employee) {
					System.out.println("Employee Id         : "+emp.getEmpId());
					System.out.println("Employee Name       : "+emp.getEmpName());
					System.out.println("Employee Salary     : "+emp.getEmpSalary());
					System.out.println("Employee Department : "+emp.getEmpDepartment());
					
					System.out.println("*********************************");
					
				    }
				}catch(Exception eeee)
				{
					System.out.println(eeee.getMessage());
				}  
				
				
				break;
				
			case 6 :
				
				System.out.println("Thank You...");
	            System.exit(0);
	            
	       default :
	    	   System.out.println("Invalid Choice");
	    	   break;
			}
			 
		}
		
		
		
		
	}
	
	
	
}
