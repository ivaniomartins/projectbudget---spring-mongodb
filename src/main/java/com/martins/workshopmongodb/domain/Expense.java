package com.martins.workshopmongodb.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="expense")
public class Expense {
	
private Double value;
private Integer qtdPorcion;
private Double vlPorcion = 0.0;

private List<Budget> budget = new ArrayList<>();

public Expense() {
	
}


public Expense(Double value, Integer qtdPorcion) {

	this.value = value;
	this.qtdPorcion = qtdPorcion;
	this.porcionValue(this.qtdPorcion, this.value);
	
}


public Double getValue() {
	return value;
}


public void setValue(Double value) {
	this.value = value;
}


public Integer getQtdPorcion() {
	return qtdPorcion;
}


public void setQtdPorcion(Integer qtdPorcion) {
	this.qtdPorcion = qtdPorcion;
}



public Double getVlPorcion() {
	return vlPorcion;
}


public void setVlPorcion(Double vlPorcion) {
	this.vlPorcion = vlPorcion;
}




public List<Budget> getBudget() {
	return budget;
}


/*
 * método para retornar o valor das parcelas
 */
public Double porcionValue(Integer qtdPorcion, Double value) {
	return this.vlPorcion = this.value/this.qtdPorcion;
}



}
