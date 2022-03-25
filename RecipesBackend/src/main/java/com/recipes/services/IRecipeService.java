package com.recipes.services;

import java.util.List;

import com.recipes.entity.Recipe;

public interface IRecipeService {

	public List<Recipe> getAll();

	public Recipe get(String id);

	public Recipe create(Recipe recipe);

	public Recipe update(Recipe recipe);

	public void delete(String id);

}
