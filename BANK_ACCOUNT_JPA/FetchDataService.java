package com.Sample.JPA.Bank;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@RestResource(exported = false)
public interface FetchDataService extends JpaRepository<UserModel,Integer>{
	
//List<UserModel> findAll();
	Optional<UserModel> findById(int id);
}
