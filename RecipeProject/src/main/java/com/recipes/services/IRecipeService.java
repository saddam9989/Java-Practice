package com.recipes.services;

import java.util.List;

import com.recipes.entity.Recipe;
import com.recipes.exception.RecipeNotFoundException;

public interface IRecipeService {

	public List<Recipe> recipesList();

	public Recipe addRecipe(Recipe recipe);

	public void updateRecipe(Recipe recipe);

	public void deleteRecipe(int recipeId);
	
	public Recipe getRecipe(int recipeId);
	
	



}
