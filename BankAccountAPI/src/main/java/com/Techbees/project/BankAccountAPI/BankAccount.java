package com.Techbees.project.BankAccountAPI;

public class BankAccount {
	
	public BankAccount(String custFirstName, String phoneNum) {
		super();
		CustFirstName = custFirstName;
		PhoneNum = phoneNum;
	}
	private String AccountNum;
	private String CustFirstName;
	private String CustLastName;
	private String Email;
	private String PhoneNum;
	
	public BankAccount() {
		
	}
	public BankAccount(String CustFirstName,String CustLastName,String AccountNum,String Email,String PhoneNum){
		super();
		this.CustFirstName=CustFirstName;
		this.CustLastName=CustLastName;
		this.AccountNum=AccountNum;
		this.Email=Email;
		this.PhoneNum=PhoneNum;
	
		
	}
	
	public String getAccountNum() {
		return AccountNum;
	}
	public void setAccountNum(String accountNum) {
		
		if(accountNum.length() != 5) {
			System.out.println("Please enter a 5 digit number!!!");
		}else
			
		AccountNum = accountNum;
	}
	
	public String getCustFirstName() {
		return CustFirstName;
	}
	public void setCustFirstName(String custFirstName) {
		
		if (custFirstName.length() <= 1) {
			System.out.println("Please enter a valid First Name");
		}else
		CustFirstName = custFirstName;
	}
	
	public String getCustLastName() {
		return CustLastName;
	}
	public void setCustLastName(String custLastName) {
		if (custLastName.length() <= 1)
		{
			System.out.println("Please enter a valid Last Name");
		}else 
		CustLastName = custLastName;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		if (email.matches(regex))
		{		
		Email = email;
		}
		else 
			System.out.println("Enter a valid email address ");
	}
	
	public String getPhoneNum() {
		return PhoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		
		if(phoneNum.length() < 10) {
			
			PhoneNum="Invalid Phone Number";
			
		}
		else
		PhoneNum = phoneNum;
	}
/*	public void deposit(float amount)
	{
		if (amount != 0)
		{
			AccountBalance = AccountBalance + amount;
			System.out.println("Amount Deposited!! "+"Account Balance is " + AccountBalance);
		}
		
	}
	public void withdraw(float amount)
	{
		if (amount != 0)
		{
			AccountBalance = AccountBalance - amount;
			System.out.println("Amount Withdrawn!! "+"Account Balance is " + AccountBalance);

		}
	}
	*/
	

}
