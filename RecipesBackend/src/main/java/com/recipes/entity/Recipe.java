package com.recipes.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Recipe {
     
	@Id
	private String id;
	
	@Column
	private String name;

	@Column
	private LocalDateTime created;
	
	@Column
	private boolean vegan;
	
	@Column
	private int servings;
	
	@Column
	private List<String> ingrediants;

	@Column
	private String instructions;

}
