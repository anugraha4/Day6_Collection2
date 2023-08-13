package com.nestjavatraining.sorting.entity;

public class Customers implements Comparable<Customers> {
	private String customerName;
	private int customerAge;

	public Customers(String customerName, int customerAge) {

		super();
		this.customerName = customerName;
		this.customerAge = customerAge;

	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		
		this.customerAge = customerAge;
		
	

	
	}
	
@Override
public int compareTo(Customers o) {
	
	// TODO Auto-generated method stub 
	if(this.customerAge==o.customerAge) {
		
		return 0;
		
	} else if(this.customerAge>o.customerAge) { 
		
		return 1;
		
	} else {
		
		return -1;
		
	} 
	
}
@Override
public String toString() {
	
	return customerName+"\t\t\t "+customerAge;
	
}

}
