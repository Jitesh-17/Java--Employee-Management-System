package repository;

import model.Employee;
import java.util.*;


public class EmployeeRepository {
	
	private List<Employee> employees = new ArrayList<>();
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public List<Employee> getAllEmployees(){
		return employees;
	}
	
	public Employee findEmployeeById(int id) {
		
		for(Employee employee : employees) {
			
			if(employee.getId()==id) {
				return employee;
			}
			
		}
		return null;
	}
	
	public boolean deleteEmployee(int id) {
		
		Employee employee = findEmployeeById(id);
		
		if(employee != null) {
			employees.remove(employee);
			return true;
		}
		return false;
	}
}
