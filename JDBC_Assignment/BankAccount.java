package com.TechBee.DAO;

public class BankAccount {
	private int AccountNum;
	private String CustFirstName;
	private String CustLastName;
	private String Email;
	private String PhoneNum;
	
	public BankAccount() {
		
	}
	public BankAccount(String CustFirstName,String CustLastName,String PhoneNum,String Email,int AccountNumber){
		super();
		this.CustFirstName=CustFirstName;
		this.CustLastName=CustLastName;
		this.PhoneNum=PhoneNum;
		this.Email=Email;
		this.AccountNum=AccountNum;	
	}
	public BankAccount(String CustLastName,int AccountNum,String Email,String PhoneNum){
		this.CustLastName=CustLastName;
		this.PhoneNum=PhoneNum;
		this.Email=Email;
		this.AccountNum=AccountNum;	
	}
	
	public int getAccountNum() {
		return AccountNum;
	}
	public void setAccountNum(int AccNum) {
		AccountNum=AccNum;
		//AccountNum = Math.random() * (max - min + 1) + min;
		//System.out.println(""+AccountNum);
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
