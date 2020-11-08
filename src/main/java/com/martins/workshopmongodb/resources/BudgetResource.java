package com.martins.workshopmongodb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.martins.workshopmongodb.domain.Budget;
import com.martins.workshopmongodb.services.BudgetService;

@RestController
@RequestMapping(value = "/budgets")
public class BudgetResource {
	
	@Autowired
	private BudgetService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Budget>> findAll() {

		List<Budget> list = service.findAll();
		
		return ResponseEntity.ok().body(list);

	}

}
