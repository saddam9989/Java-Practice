package com.recipes.services;

import java.util.List;

import com.recipes.entity.Recipe;
import com.recipes.exception.RecipeNotFoundException;

public interface IRecipeService {

	public List<Recipe> recipesList();

	public Recipe addRecipe(Recipe recipe);

	public Recipe updateRecipe(String id,Recipe recipe);

	public void deleteRecipe(String id);
	
	public Recipe findByRecipeId(String recipeId);
	
	



}
