package com.recipes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ingredients")
public class Ingredients {


	@Id
	@Column
	private String ingredientsList;
	
	

	public Ingredients() {
		super();
	}

	public Ingredients(String ingredientsList) {
		super();
		this.ingredientsList = ingredientsList;
	}

	public String getIngredientsList() {
		return ingredientsList;
	}

	public void setIngredientsList(String ingredientsList) {
		this.ingredientsList = ingredientsList;
	}
	
	@Override
	public String toString() {
		return "Ingredients [ingredientsList=" + ingredientsList + "]";
	}
	

}
