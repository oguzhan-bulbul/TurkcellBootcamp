package oop2;
//Service 
//Operation class

public class IndividualCustomerManager {
	public void add(IndividualCustomer individualCustomer) {
		System.out.println("Added : " + individualCustomer.getFirstName());
	}
	public void update(IndividualCustomer individualCustomer) {
		System.out.println("Updated : " + individualCustomer.getFirstName());
	}
	public void delete(IndividualCustomer individualCustomer) {
		System.out.println("Deleted : " + individualCustomer.getFirstName());
	}


}
