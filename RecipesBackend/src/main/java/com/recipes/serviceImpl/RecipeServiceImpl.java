package com.recipes.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recipes.entity.Recipe;
import com.recipes.repository.IRecipeRepository;
import com.recipes.services.IRecipeService;

@Service
public class RecipeServiceImpl implements IRecipeService {

	
	@Autowired
	private IRecipeRepository recipeRepository;
	
	
	
	@Override
	public List<Recipe> recipesList() {
		
		return recipeRepository.findAll();
		
		
	}
	
	@Override
	public Recipe addRecipe(Recipe recipe) {
		
		return recipeRepository.save(recipe);
		
	}

	public Recipe updateRecipe(String id, Recipe recipe)  {
		
		Optional<Recipe> currentRecipe = recipeRepository.findById(id);
		
		if(currentRecipe.isPresent()) {
			Recipe _recipe = currentRecipe.get();
			_recipe.setName(recipe.getName());
			_recipe.setVegan(recipe.isVegan());
			_recipe.setInstructions(recipe.getInstructions());
			_recipe.setServings(recipe.getServings());
			_recipe.setCreated(recipe.getCreated());
			_recipe.setIngredients(recipe.getIngredients());
			
			
			return recipeRepository.save(_recipe);
		}
		
		return recipeRepository.save(recipe);
	}

	
	@Override
	public void deleteRecipe(String id) {
		
		recipeRepository.deleteById(id);
	}
	
	@Override
	public Recipe findByRecipeId(String recipeId) {
		return recipeRepository.getOne(recipeId);
		
	}

}
