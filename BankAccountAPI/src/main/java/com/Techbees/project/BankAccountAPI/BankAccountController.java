package com.Techbees.project.BankAccountAPI;

import java.util.ArrayList;
import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BankAccountController {
     
	@Autowired
	BankAccountDaoDB DAO = new BankAccountDaoDB();
	
	@GetMapping("/users")
	public ArrayList<BankAccount> getAllUsers()
	{
		return DAO.displayAllUsersInfoDB();
	}
	
	@GetMapping("/user/{name}")
	public BankAccount getOneUser(@PathVariable("name") String name)
	{
		return DAO.retreiveUserInfo(name);
	}
	
	@PostMapping("/create")
	public void addUser(@RequestBody BankAccount user)
	{
		
		 DAO.addUserDB(user);
	}

	@PutMapping("/updatePhonenumber/")
	public void updateUserPhone(@RequestBody BankAccount user)
	{
		DAO.updateUserInfoDB(user.getCustFirstName(),user.getPhoneNum());
		
	}
	@PutMapping("/updateUserInfo/")
	public void updateUserInfo(@RequestBody BankAccount user)
	{
		DAO.updateUserInfoDB(user);
		
	}

	@DeleteMapping("/user/{name}")
	public void deleteOneUser(@PathVariable("name") String name)
	{
		DAO.deleteOneAccountDB(name);
	}
}
