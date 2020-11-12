package com.martins.workshopmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martins.workshopmongodb.domain.Expense;
import com.martins.workshopmongodb.repository.ExpenseRepository;

@Service
public class ExpenseService {
	
    @Autowired
	private ExpenseRepository repo;
	
	
	public List<Expense> findAll(){
		
		return repo.findAll();
	}

	
}
