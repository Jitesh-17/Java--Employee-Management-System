package model;

import interfaces.Payable;

public class ContractEmployee extends Employee implements Payable{

	private double contractAmount;
	
	public ContractEmployee(int id , String name,String department,double contractAmount) {
		
		super(id,name,department);
		this.contractAmount = contractAmount;
	}
	
	@Override
	public double calculateSalary() {
		return contractAmount;
	}
	
	public double getContractAmount() {
		return contractAmount;
	}
	
	@Override
	public void processPayment() {
		System.out.println(getName()+ " Payment Processed Sucessfully!");
	}
}
