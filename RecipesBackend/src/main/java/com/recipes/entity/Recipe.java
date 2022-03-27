package com.recipes.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;


@Entity
@Table(name = "Recipe")
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	@Column
	private String name;

	
	private LocalDateTime created;

	@Column
	private boolean vegan;

	@Column
	private int servings;

	@Column
	private String instructions;
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@Column
	private List<Ingredients> ingredients;
	
	

	public Recipe() {
		super();
	}

	public Recipe(String id, String name, LocalDateTime created, boolean vegan, int servings, String instructions,
			List<Ingredients> ingredients) {
		super();
		this.id = id;
		this.name = name;
		this.created = created;
		this.vegan = vegan;
		this.servings = servings;
		this.instructions = instructions;
		this.ingredients = ingredients;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public boolean isVegan() {
		return vegan;
	}

	public void setVegan(boolean vegan) {
		this.vegan = vegan;
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

	public List<Ingredients> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredients> ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Recipe [id=" + id + ", name=" + name + ", created=" + created + ", vegan=" + vegan + ", servings="
				+ servings + ", instructions=" + instructions + ", ingredients=" + ingredients + "]";
	}
	
	
 
}