package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Account;

public interface AccountRepository extends CrudRepository<Account, Integer> {

	boolean existsBySub(String sub);
	
	Account getBySub(String sub);

}
