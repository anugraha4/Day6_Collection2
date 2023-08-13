package com.nestjavatraining.sort.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


import com.nestjavatraining.sorting.entity.Customers;


public class CollectionUtility {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char ch;

		String sortingParameter = "";
		List<Customers> customerList = new ArrayList<Customers>();
		customerList.add(new Customers("Anu",22));
		customerList.add(new Customers("Ajish",27));
		customerList.add(new Customers("Ashna",23));
		customerList.add(new Customers("Gokul",25));
		customerList.add(new Customers("Amala",30));
		customerList.add(new Customers("Ashwin",40));
		customerList.add(new Customers("Jeffrey",15));
		
		System.out.println("");

		System.out.println("Customer List Before Sorting");

		System.out.println("Customer Name" + " " + "Customer Age");

		for (Customers customer : customerList)

		System.out.println(customer.getCustomerName() + " " + customer.getCustomerAge());

		do

		{

		System.out.println("");

		System.out.println("1. Sort Based On Name, 2. Sort Based On Age");

		int choice = scanner.nextInt();
		
		switch(choice)

		{

		case 1 :
			
			Collections.sort(customerList,(Customers o1,Customers o2) -> o1.getCustomerName().compareTo(o2.getCustomerName()));

			sortingParameter = "Customer List After Sorting Based On Name";

			break;

		case 2 :
			
			Collections.sort(customerList,(Customers o1,Customers o2) -> o1.getCustomerAge() - o2.getCustomerAge());

			sortingParameter = "Customer List After Sorting Based On Age";

			break;

		}
		
		System.out.println(sortingParameter);

		System.out.println("Customer Name" + " " + "Customer Age");

		for (Customers customer : customerList)

		System.out.println(customer.getCustomerName() + " " + customer.getCustomerAge());

		System.out.println("");

		System.out.println("Do you want to continue (y/n)");

		ch = scanner.next().charAt(0);

		}

		while(ch == 'y');

		}
		//System.out.println("CustomerName" + "\t" + "CustomerAge\n");
		//for(Customers customer:customerList)System.out.println(customer.getCustomerName() + "\t\t\t"+customer.getCustomerAge() );
		//while(true) {
			//System.out.println("\n1.Sort on CustomerName\t 2.Sort on CustomerAge \t3.Exit\n");
			//System.out.println("Enter your choice");
			//int c = s.nextInt();
		//switch(c) {
			
		//case 1:
				
		//System.out.println("Customer List After Sorting Based On Name\n");
		//System.out.println("Customer Name" +"\t\t"+ "Customer Age\n");
		//customerList.stream().sorted((customer1,customer2)->customer1.getCustomerName().compareTo(customer2.getCustomerName())).forEach(System.out::println);
		//break;
				
		//case 2: 
					
		//System.out.println("Customer List After Sorting Based On Age\n");
		//		System.out.println("Customer Name" + " \t\t" + "Customer Age\n");
		//		customerList.stream().sorted().forEach(customer3->System.out.println(customer3));
		//		break;
		//		
		//		case 3: 
						
		//			s.close();
		//			System.exit(0); 
		//			default :System.out.println("Invalid Choice");
		//			
		//}
			
		}
		
	
	

	
