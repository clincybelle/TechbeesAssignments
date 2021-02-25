package com.TechBee.DAO;

import java.sql.Connection;
import java.util.Scanner;

public class FrontEndClass {

	public static void main(String[] args) {
        
		BankAccountDAO DAO = new BankAccountDAO();
		BankAccountDaoDB DADB = new BankAccountDaoDB();
		Connection connection = DADB.getConnection();
		
        int op='\0';
        Scanner options = new Scanner(System.in);
		
		System.out.println(" ***Welcome*** ");
		System.out.println("1. Add user ");
		System.out.println("2. Display all users  ");
		System.out.println("3. Display all users Information  ");
		System.out.println("4. Display an user's Information  ");
		System.out.println("5. Update user Information ");
		System.out.println("6. Delete one user account ");
		System.out.println("7. Delete all users ");
		System.out.println("8. Exit ");
		System.out.println("");
		
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
				System.out.println("Enter your 10 digit Phone Number: ");
				String phoneNum = options.next();
				BA.setPhoneNum(phoneNum);
				System.out.println("Enter your email address: ");
				String email = options.next();
				BA.setEmail(email);
				System.out.println("Enter your 5 digit account number: ");
				int accNum = options.nextInt();
				BA.setAccountNum(accNum);
				DADB.addUserDB(BA);
				//DAO.addUser(BA);
				System.out.println("User Account added ");
				}while(op != 1);
				break;
			case 2:	
				DADB.displayAllUsersDB();
				break;
			case 3:
				//DAO.displayUsers();
				DADB.displayAllUsersInfoDB();
				break;
			case 4:
				//DAO.displayUsers();
				System.out.println("Please enter the username " );
				String name = options.next();
				//DAO.userAccountInfo(name);
				DADB.userAccountInfoDB(name);
				break;
			case 5:
				System.out.println("Please enter the username :");
				String CustFirstName = options.next();
				System.out.println("Please enter the new phone Number:");
				String PhoneNum = options.next();
				//DAO.updateUserInfo(CustFirstName,PhoneNum);
				DADB.updateUserInfoDB(CustFirstName,PhoneNum);
				break;
			case 6:
				System.out.println("Please the first name of the user to be removed ");
				String CustomerName= options.next();
				//DAO.deleteOneAccount(CustomerName);
				DADB.deleteOneAccountDB(CustomerName);
				break;
			case 7:
				//DAO.deleteAll();
				DADB.deleteAllDB();
				break;
			case 8:
				System.out.println("***********************Thank you*************************");
				System.exit(0);
				break;
				
			
		}
		}while(op != 8);
		options.close();
	}

}
