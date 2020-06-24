package com.Oopsagain2.zak;

public class CustomeRunner {

	public static void main(String[] args) {
		Address hmadd=new Address("line1","Hyd", "500008");
		Customer customer=new Customer("ranga", hmadd);
		System.out.println(customer);
		
		Address wrkadd=new Address("lin wrk","Hyd", "500016");
		customer.setWrkadd(wrkadd);
		System.out.println(customer);
	}

}
