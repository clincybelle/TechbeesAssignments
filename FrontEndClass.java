package com.techbeesolutions.Encapsulation;

import java.util.Scanner;

public class FrontEndClass {

	public static void main(String[] args) {
		

		BankAccount bAccount = new BankAccount();
		
		
		
		
		
//		System.out.println("Customer First Name: " + bAccount.getCustFirstName());
//		System.out.println("Customer Last Name: " + bAccount.getCustLastName());
//		System.out.println("Account Number: " +bAccount.getAccountNum());
//		System.out.println("Account Balance: " +bAccount.getAccountBalance());
//		System.out.println("Email Address: " +bAccount.getEmail());
//		System.out.println("Phone Number: " +bAccount.getPhoneNum());
//	
		//System.out.println(bAccount.toString());
		
		Scanner options = new Scanner(System.in);
		
		System.out.println("Choose an option: ");
		System.out.println("1. Show Account Information and Balance ");
		System.out.println("2. Deposit Funds ");
		System.out.println("3. Withdraw Funds ");
		System.out.println("4. Exit ");
		System.out.println("");
		
		int op = options.nextInt();
		
		bAccount.setAccountNum(123456789);
		bAccount.setAccountBalance(40f);
		bAccount.setCustFirstName("Clincy");
		bAccount.setCustLastName("Vivek");
		bAccount.setEmail("clincybelle@gmail.com");
		bAccount.setPhoneNum("2622694718");
		
		switch(op)
		{
			case 1:
				bAccount.show();
				break;
			case 2:
				bAccount.depositFunds(4000);
				break;
			case 3:
				bAccount.withdrawFunds(41);
				break;
			case 4:
				System.out.println("***********************Thank you*************************");
				System.exit(0);
				break;
				
			
		}
		
		//bAccount.depositFunds(30000);
		//bAccount.withdrawFunds(2000);
		
		

	}

}
