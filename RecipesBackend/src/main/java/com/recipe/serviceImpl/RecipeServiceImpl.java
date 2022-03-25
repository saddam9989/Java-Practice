package com.recipe.serviceImpl;

import java.util.List;

import com.recipe.repository.IRecipeRepository;
import com.recipes.entity.Recipe;
import com.recipes.services.IRecipeService;

public class RecipeServiceImpl implements IRecipeService {

	private IRecipeRepository recipeRepository;
	
	@Override
	public List<Recipe> getAll() {
		
		return recipeRepository.findAll();
		
		
	}

	@Override
	public Recipe get(String id) {
		
		return recipeRepository.getById(id);
	}

	
	@Override
	public Recipe create(Recipe recipe) {
		
		return recipeRepository.save(recipe);
		
	}

	@Override
	public Recipe update(Recipe recipe) {
		
		return recipeRepository.save(recipe);
		
	}

	@Override
	public void delete(String id) {
		
		recipeRepository.deleteById(id);
		
		
	}

}
