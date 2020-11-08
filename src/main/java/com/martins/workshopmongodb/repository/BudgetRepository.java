package com.martins.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.martins.workshopmongodb.domain.Budget;

@Repository
public interface BudgetRepository extends MongoRepository<Budget, String>{
	
	

}
