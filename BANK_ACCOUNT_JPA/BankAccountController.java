package com.Sample.JPA.Bank;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path="/users",consumes = "application/json")
public class BankAccountController {
	
	
	
	@Autowired
	FetchDataService fds;
	
	
	
	@GetMapping
	List<UserModel> getAllUsers()
	{
		return fds.findAll();
	}
	

	@GetMapping(path="/{id}")
	public Optional<UserModel> find(@PathVariable("id") int id)
	{
		return fds.findById(id);
	}
	
	@PostMapping
	public UserModel addUser(@RequestBody UserModel user )
	{
	
		return fds.save(user);
		
	}
	 @PutMapping(path = "/{id}")
	    public UserModel update(@PathVariable("id") int id, @RequestBody UserModel user)
	 {
	        if (fds.existsById(id)) {
	            user.setId(id);
	            return fds.save(user);
	        }
	           return null;
	 }
	
	@DeleteMapping(path="/{id}")
	public void update(@PathVariable("id") int id)
	{
		if(fds.existsById(id)) {
			//user.setCustFirstName(username);
			fds.deleteById(id);
		}
	}
	

}

