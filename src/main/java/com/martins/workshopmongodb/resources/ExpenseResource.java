package com.martins.workshopmongodb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.martins.workshopmongodb.domain.Expense;
import com.martins.workshopmongodb.services.ExpenseService;

@RestController
@RequestMapping(value = "/expenses")
public class ExpenseResource {

	@Autowired
	private ExpenseService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Expense>> findAll() {

		List<Expense> list = service.findAll();

		return ResponseEntity.ok().body(list);

	}

}
