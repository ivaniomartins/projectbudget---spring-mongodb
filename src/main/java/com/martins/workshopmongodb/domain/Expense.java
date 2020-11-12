package com.martins.workshopmongodb.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="expense")
public class Expense {
	
private Double value;
private Integer qtdPorcion;



public Expense() {
	
}


public Expense(Double value, Integer qtdPorcion) {
	super();
	this.value = value;
	this.qtdPorcion = qtdPorcion;
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

/*
 * método para returno do valor das parcelas
 */
public Double porcionValue(Integer qtdPorcion, Double value) {
	return this.getValue()/this.getQtdPorcion();
}
}
