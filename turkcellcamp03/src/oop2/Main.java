package oop2;

public class Main {

	public static void main(String[] args) {
		
		CorporateCustomer corporateCustomer1 = 
				new CorporateCustomer(1,"123","info@turkcell.com","Turkcell","364723");
		
		IndividualCustomer individualCustomer1 =
				new IndividualCustomer(1,"1234","ouzan@mail","Oguzhan","Bulbul","656565656");
		
		Customer[] customers = {corporateCustomer1,individualCustomer1};
		// Temel siniflar onlari inherit eden siniflarin objelelerini tutabilir.
		
		IndividualCustomerManager individualCustomerManager = 
				new IndividualCustomerManager();
		individualCustomerManager.add(individualCustomer1);
		
		
		
		
		
		
	
		
		
	}

}
