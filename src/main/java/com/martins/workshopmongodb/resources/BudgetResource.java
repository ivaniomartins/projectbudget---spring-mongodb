package com.martins.workshopmongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.martins.workshopmongodb.domain.Budget;
@RestController	
@RequestMapping(value="/budgets")
public class BudgetResource {
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Budget>> findAll(){
		
      		List<Budget> list = new ArrayList<>();
            Budget budget1 = new Budget("1", 2500.00, new Date());
            Budget budget2 = new Budget("2", 2000.00, new Date());
            
            list.addAll(Arrays.asList(budget1, budget2));
            return ResponseEntity.ok().body(list);
            
            
		
	} 

}
