package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Account;

public interface AccountRepository extends CrudRepository<Account, Integer> {

}
