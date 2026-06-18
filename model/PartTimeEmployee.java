package model;

import interfaces.Payable;

public class PartTimeEmployee extends Employee implements Payable {

	private int hoursWorked;
	private double hourlyRate;
	
	public PartTimeEmployee(int id,String name, String department, int hoursWorked,double hourlyRate) {
		
		super(id,name,department);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public double calculateSalary() {
		return hoursWorked * hourlyRate;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}
	
	@Override
	public void processPayment() {
		System.out.println(getName()+ " Payment Processed Sucessfully!");
	}
	
}
