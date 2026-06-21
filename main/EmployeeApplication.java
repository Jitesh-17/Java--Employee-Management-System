package main;

import java.util.*;
import model.Employee;
import model.FullTimeEmployee;
import model.PartTimeEmployee;
import model.ContractEmployee;
import repository.EmployeeRepository;
import service.EmployeeService;


public class EmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeRepository repository = new EmployeeRepository();
		
		EmployeeService service = new EmployeeService(repository);
		
		Scanner sc = new Scanner(System.in);
		
		boolean running = true;

		while (running) {

		    System.out.println("\nEmployee Management System");
		    System.out.println("1. Add Employee");
		    System.out.println("2. View Employees");
		    System.out.println("3. Search Employee");
		    System.out.println("4. Delete Employee");
		    System.out.println("5. Calculate Salary");
		    System.out.println("6. Exit");

		    int choice = sc.nextInt();

		    switch (choice) {
		    	case 1:
		    	    System.out.println("\nSelect Employee Type");
		    	    System.out.println("1. Full Time");
		    	    System.out.println("2. Part Time");
		    	    System.out.println("3. Contract");

		    	    int employeeType = sc.nextInt();
		    	    
		    	    System.out.println("Enter id:");
		    	    int id = sc.nextInt();
		    	    
		    	    sc.nextLine();
		    	    
		    	    System.out.println("Enter Name:");
		    	    String name = sc.nextLine();
		    	    
		    	    System.out.println("Enter department name:");
		    	    String department = sc.nextLine();
		    	    
		    	    Employee employee = null;
		    	    
		    	    if(employeeType==1) {
		    	    	
		    	    	System.out.println("Enter Monthly Salary");
		    	    	double monthlySalary= sc.nextDouble();
		    	    	
		    	    	 employee = new FullTimeEmployee(id,name,department,monthlySalary);
		    	    }
		    	    else if(employeeType==2){
		    	    	System.out.println("Enter hours Worked");
		    	    	int hoursWorked = sc.nextInt();
		    	    	
		    	    	System.out.println("Enter hourly rate");
		    	    	double hourlyRate = sc.nextDouble();
		    	    	
		    	    	 employee = new PartTimeEmployee(id,name,department,hoursWorked,hourlyRate);
		    	    }
		    	    else if(employeeType==3){
		    	    	System.out.println("Enter Contract Employee");
		    	    	double contractAmount = sc.nextDouble();
		    	    	
		    	    	
		    	    	employee = new ContractEmployee(id,name,department,contractAmount);
		    	    	
		    	    }
		    	    else {
		    	    	System.out.println("Invalid Employee");
		    	    }
		    	    
		    	    if(employee != null) {
		    	    	
		    	    	boolean added = service.addEmployee(employee);
		    	    	
		    	    	if(added) {
		    	    		System.out.println("Employee Added Sucessfully");
		    	    	}
		    	    	else {
		    	    		System.out.println("Employee Already Exists");
		    	    	}
		    	    }
		    	    

		    	    break;

		        case 6:
		            running = false;
		            System.out.println("Exiting...");
		            break;

		        default:
		            System.out.println("Invalid Choice");
		    }
		}

	}

}
