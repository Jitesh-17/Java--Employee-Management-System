package model;

import interfaces.Payable;

public class FullTimeEmployee extends Employee implements Payable {
	
	private double monthlySalary;
	
	public FullTimeEmployee(int id,String name,String department,double monthlySalary) {
		
		super(id,name,department);
		this.monthlySalary = monthlySalary;
	}
	
	@Override
	public double calculateSalary() {
		return monthlySalary;
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	@Override
	public void processPayment() {
		System.out.println(getName()+ " Payment Processed Sucessfully!");
	}
}
