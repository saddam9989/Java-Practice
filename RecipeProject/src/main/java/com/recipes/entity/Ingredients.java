package com.recipes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "INGREDIENTS")
public class Ingredients {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private int id;
	
	@Column
	private String ingredientsList;
	
	
	
	public Ingredients() {
		super();
	}


	public Ingredients(String ingredientsList) {
		super();
		this.ingredientsList = ingredientsList;
		
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIngredientsList() {
		return ingredientsList;
	}

	public void setIngredientsList(String ingredientsList) {
		this.ingredientsList = ingredientsList;
	}
	
}
