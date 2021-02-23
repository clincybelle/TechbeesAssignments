package com.Asssignment.DAO;

import java.util.Scanner;

public class FrontEndClass {

	public static void main(String[] args) {
		
        BankAccountDAO DAO = new BankAccountDAO();
		
        int op='\0';
        Scanner options = new Scanner(System.in);
		
		System.out.println(" ***Welcome*** ");
		System.out.println("1. Add user ");
		System.out.println("2. Display users  ");
		System.out.println("3. Display user Information  ");
		System.out.println("4. Update user Information ");
		System.out.println("5. Delete one user ");
		System.out.println("6. Delete all users ");
		System.out.println("7. Exit ");
		System.out.println("");
		
/*		
		BA.setAccountNum("12345");
		BA.setCustFirstName("Clincy");
		BA.setCustLastName("Vivek");
		BA.setAccountBalance(50.0f);
		BA.setEmail("clincybelle@gmail.com");
		BA.setPhoneNum("2622694718");
		
		BankAccount BA1 = new BankAccount();
		BA1.setAccountNum("13345");
		BA1.setCustFirstName("Clinson");
		BA1.setCustLastName("Bere");
		BA1.setAccountBalance(54440.0f);
		BA1.setEmail("clinsonbere@gmail.com");
		BA1.setPhoneNum("2622574971");
	*/
		do {
			System.out.println("***************");
			System.out.println("Enter an option:");
			System.out.println("=================");
			op = options.nextInt();
			System.out.println("\n");
	
		switch(op)
		{
			case 1:
				do {
					BankAccount BA = new BankAccount();
					System.out.println("Enter your First Name: ");
					String firstName = options.next();
					BA.setCustFirstName(firstName);
					System.out.println("Enter your Last Name: ");
					String lastName = options.next();
					BA.setCustLastName(lastName);
					System.out.println("Enter your Phone Number: ");
					String phoneNum = options.next();
					BA.setPhoneNum(phoneNum);
					System.out.println("Enter your email address: ");
					String email = options.next();
					BA.setEmail(email);
					DAO.addUser(BA);
					System.out.println("User Account added ");
					}while(op != 1);
				//DAO.addUser(BA);
				//DAO.addUser(BA1);
				break;
			case 2:
				DAO.displayUsers();
				break;
			case 3:
				DAO.displayUsers();
				System.out.println("Please enter the username " );
				String name = options.next();
				DAO.userAccountInfo(name);
				break;
			case 4:
				System.out.println("Please enter the username :");
				String CustFirstName = options.next();
				System.out.println("Please enter the new phone Number:");
				String PhoneNum = options.next();
				DAO.updateUserInfo(CustFirstName,PhoneNum);
				break;
			case 5:
				System.out.println("Please the first name of the user to be removed ");
				String CustomerName= options.next();
				DAO.deleteOneAccount(CustomerName);
				break;
			case 6:
				DAO.deleteAll();
				break;
			case 7:
				System.out.println("***********************Thank you*************************");
				System.exit(0);
				break;
				
			
		}
		}while(op != 6);
		options.close();
	}

}
