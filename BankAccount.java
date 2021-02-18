package com.techbeesolutions.Encapsulation;

public class BankAccount {

	private int AccountNum;
	private float AccountBalance;
	private String CustFirstName;
	private String CustLastName;
	private String Email;
	private String PhoneNum;
	
	//private float DepositAmount;
	


	@Override
	public String toString() {
		return "BankAccount [AccountNum=" + AccountNum + ", AccountBalance=" + AccountBalance + ", CustFirstName="
				+ CustFirstName + ", CustLastName=" + CustLastName + ", Email=" + Email + ", PhoneNum=" + PhoneNum
				+ "]";
	}

/*	public BankAccount(int accountNum , float accountBalance ,String custFirstName, String custLastName, String email ,long phoneNum ) {
    
	accountNum = AccountNum;
    accountBalance = AccountBalance;
    custFirstName = CustLastName;
    custLastName = CustLastName;
    email = Email;
    phoneNum = PhoneNum;
    
    
	}*/
	
	public int getAccountNum() {
		return AccountNum;
	}

	public void setAccountNum(int accountNum) {
		AccountNum = accountNum;
	}

	public float getAccountBalance() {
		return AccountBalance;
	}

	public void setAccountBalance(float accountbalance) {
		
		if (accountbalance >=0 )
		{
			
		AccountBalance = accountbalance;
		//System.out.println("Account Balance is : " +AccountBalance);
		}
		else
		{
			System.out.println("Balance Should not be Negative!!");
		}
	}

	public String getCustFirstName() {
		return CustFirstName;
	}

	public void setCustFirstName(String custFirstName) {
		//Validating customer first name
		if(custFirstName == null || custFirstName.length() <=1)
		{
			custFirstName="Invalid Name!!";
		}
		CustFirstName = custFirstName;
	}

	public String getCustLastName() {
		return CustLastName;
	}

	public void setCustLastName(String custLastName) {
		//Validating customer last name
				if(custLastName == null || custLastName.length() <=1)
				{
					System.out.println("Invalid Name!!");
				}
		CustLastName = custLastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhoneNum() {
		return PhoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		if (phoneNum.matches("[a-zA-z]+")) {
			
			phoneNum ="Invalid Number";
		}
		else if(phoneNum.length() < 10 || phoneNum.length() > 10) {
			phoneNum ="Invalid Number";
		}
		else if(phoneNum.startsWith("1")) {
			phoneNum = "Invalid Number";
		}
		PhoneNum = phoneNum;
	}
	
	public void show() {
		System.out.println("Customer First Name: " +CustFirstName);
		System.out.println("Customer Last Name: " +CustLastName);
		System.out.println("Account Number: " +AccountNum); 
		System.out.println("Email ID: " +Email);
		System.out.println("Phone Number: "+PhoneNum);
		System.out.println("Account Balance: "+AccountBalance);
		
	}
	
	public void depositFunds(float Funds)
	{
		
	AccountBalance+= Funds;
	
	System.out.println("Deposit Amount: " +Funds);
	System.out.println("Account Balance after deposit: " +AccountBalance);

	}
	
	public void withdrawFunds(float Amount)
	{
		if( AccountBalance < Amount)
		{
			System.out.println("Insufficient Balance");
			
		}
		else
		{
			AccountBalance-= Amount;
			System.out.println("Withdrawal Amount: " +Amount);
			
		}
		System.out.println("Account Balance after withdrawal: " +AccountBalance);
	}
	public String AccountCheck(int amt)
	{
		String str = null;
    if ( amt <= 0)
    {
    	 
    	 return str;
    }
    str = "Negative'";
    return str;
	
	
	}

}

