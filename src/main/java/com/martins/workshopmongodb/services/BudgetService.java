package com.martins.workshopmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martins.workshopmongodb.domain.Budget;
import com.martins.workshopmongodb.repository.BudgetRepository;

@Service
public class BudgetService {
	
    @Autowired
	private BudgetRepository repo;
	
	
	public List<Budget> findAll(){
		
		return repo.findAll();
	}

}
