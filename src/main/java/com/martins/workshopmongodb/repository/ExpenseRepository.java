package com.martins.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.martins.workshopmongodb.domain.Expense;

@Repository
public interface ExpenseRepository extends MongoRepository<Expense, Double>{
	
	

}
