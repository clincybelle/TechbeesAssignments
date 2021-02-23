package com.Asssignment.DAO;

import java.util.LinkedList;

public class BankAccountDAO {
	
	
	LinkedList<BankAccount> bankAccount = new LinkedList<BankAccount>();
	
	public void addUser(BankAccount newAccount)
	{
		bankAccount.add(newAccount);
		System.out.println("Added new user:" + newAccount.getCustFirstName());
		
	}
	public void displayUsers()
	{
		 System.out.println("Account Users:");
		 System.out.println("");
		for( BankAccount user : bankAccount ) 
		{
	    
	    System.out.println(user.getCustFirstName());
	   
	    }
		 System.out.println("");
		 System.out.println("**********************************");
	}
	public void userAccountInfo(String CustFirstName)
	{
	
		System.out.println("Account Information of " +CustFirstName);
		for( BankAccount user : bankAccount ) 
	    {
			if(user.getCustFirstName().equals(CustFirstName)) {
	    System.out.println(user.getCustFirstName());	
	    System.out.println(user.getCustLastName());
	    System.out.println(user.getPhoneNum());
	    System.out.println(user.getEmail());
	    System.out.println(user.getAccountNum());
	    System.out.println(user.getAccountBalance());
	    System.out.println("**********************************");
	    System.out.println("");
			}
	    }
		
	}
	public void deleteOneAccount(String CustFirstName)
	{
	for (BankAccount user:bankAccount) {
		if(user.getCustFirstName().equals(CustFirstName)) 
		{
		
			bankAccount.remove(user);
			System.out.println("User Account :" + user.getCustFirstName() +", removed");
			System.out.println("*********");
		}
	}
		
	}
	public void deleteAll()
	{
		
			bankAccount.removeAll(bankAccount);
			System.out.println("All accounts removed!!");
		
	
	
	}
  public void updateUserInfo(String CustFirstName,String PhoneNum) {
	  
	 for(BankAccount user: bankAccount)
	 {
		 if(user.getCustFirstName().equals(CustFirstName)) 
		 {
		    PhoneNum=PhoneNum.replace(user.getPhoneNum(),PhoneNum);
		    user.setPhoneNum(PhoneNum);
	     }
	 }
	 System.out.println("User's phone number is updated to -->" +PhoneNum );
}
  
}
