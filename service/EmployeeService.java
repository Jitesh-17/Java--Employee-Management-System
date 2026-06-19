package service;

import model.Employee;
import repository.EmployeeRepository;
import java.util.*;

public class EmployeeService {
	
	private EmployeeRepository repository;
	
	public EmployeeService (EmployeeRepository repository) {
		this.repository = repository;
	}
	
	public boolean addEmployee (Employee employee) {
		
		if(repository.findEmployeeById(employee.getId())!= null) {
			return false;
		}
		
		repository.addEmployee(employee);
		return true;
	}
	
	public List<Employee> getAllEmployees(){
		return repository.getAllEmployees();
	}
	
	public Employee searchEmployee (int id) {
		return repository.findEmployeeById(id);
	}
	
	public boolean deleteEmployee(int id) {
		return repository.deleteEmployee(id);
	}
	
	public double calculateSalary(int id) {
		
		Employee employee = repository.findEmployeeById(id);
		
		if(employee == null) {
			return -1;
		}
		
		return employee.calculateSalary();
	}
}
