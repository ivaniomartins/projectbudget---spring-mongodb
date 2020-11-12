package com.martins.workshopmongodb.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.martins.workshopmongodb.domain.Budget;
import com.martins.workshopmongodb.domain.Expense;
import com.martins.workshopmongodb.repository.BudgetRepository;
import com.martins.workshopmongodb.repository.ExpenseRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private BudgetRepository budgetRepository;
	
	
	@Autowired
	private ExpenseRepository expenseRepository;

		@Override
	public void run(String... args) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Budget bd1 = new Budget(null, 2000.00, sdf.parse("01/10/2020"));
		
	    budgetRepository.saveAll(Arrays.asList(bd1));
	    
	    
	    Expense xp = new Expense(1000.00,10);
	    
	    expenseRepository.saveAll(Arrays.asList(xp));
	    
	    
	    
		
	}

}
