


package com.recipes.entity;


import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;




@Entity
@Table(name = "Recipe")
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int recipeId;

	@Column
	private String name;

	
    @Column
    @JsonFormat
	private LocalDate created;

	@Column
	private boolean veg;

	@Column
	private int servings;

	@Column
	private String instructions;
	
	@OneToMany(targetEntity = Ingredients.class, cascade=CascadeType.ALL)
	@JoinColumn(name="RI_fk",referencedColumnName = "recipeId")
	private List<Ingredients> ingredientsList;
	

	public Recipe() {
		super();
	}



	public Recipe( String name, LocalDate created, boolean veg, int servings, String instructions,
			List<Ingredients> ingredientsList) {
		super();
		
		this.name = name;
		this.created = created;
		this.veg = veg;
		this.servings = servings;
		this.instructions = instructions;
		this.ingredientsList = ingredientsList;
	}


	public int getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getCreated() {
		return created;
	}

	public void setCreated(LocalDate created) {
		this.created = created;
	}


	public boolean isVeg() {
		return veg;
	}


	public void setVeg(boolean veg) {
		this.veg = veg;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}



	public List<Ingredients> getIngredientsList() {
		return ingredientsList;
	}



	public void setIngredientsList(List<Ingredients> ingredientsList) {
		this.ingredientsList = ingredientsList;
	}



	


 
}