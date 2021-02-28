
package com.Sample.JPA.Bank;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name= "ACCOUNT")
public class UserModel {
	


	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Account_id")
	private int id;
	

	@Column(name="First_Name")
	private String CustFirstName;
	
	@Column(name="Last_Name")
	private String CustLastName;
	
	@Column(name="Email_ID")
	 private String Email;
	
	@Column(name="Phone_Number")
	 private String PhoneNum;
	
	
	@Column(name="Account_Number")
	 private int AccountNum;

	public String getCustFirstName() {
		return CustFirstName;
	}

	public void setCustFirstName(String custFirstName) {
		CustFirstName = custFirstName;
	}

	public String getCustLastName() {
		return CustLastName;
	}

	public void setCustLastName(String custLastName) {
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
		PhoneNum = phoneNum;
	}

	public int getAccountNum() {
		return AccountNum;
	}

	public void setAccountNum(int accountNum) {
		AccountNum = accountNum;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
