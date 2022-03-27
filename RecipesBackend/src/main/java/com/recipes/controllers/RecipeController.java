package com.recipes.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recipes.entity.Recipe;
import com.recipes.exception.RecipeNotFoundException;
import com.recipes.repository.IRecipeRepository;
import com.recipes.services.IRecipeService;


@RestController
@RequestMapping("/recipes")
public class RecipeController {

	@Autowired
	IRecipeService recipeService;

	@Autowired
	IRecipeRepository recipeRepository;

	@GetMapping("/allRecipes")
	public ResponseEntity<List<Recipe>> getAllRecipes() throws RecipeNotFoundException {

		if (recipeService.recipesList() == null) {
			
			throw new RecipeNotFoundException("No Recipes");
		
		}
		else {
		
			return new ResponseEntity<>(recipeService.recipesList(), HttpStatus.OK);
		}
	}

	@PostMapping("/addRecipe")
	public ResponseEntity<?> createRecipe(@RequestBody Recipe recipe) throws RecipeNotFoundException {

		if(recipeRepository.existsById(recipe.getId())){
		
			throw new RecipeNotFoundException("Recipe is exists in the list");
			

		} else {
			return new ResponseEntity<>(recipeService.addRecipe(recipe) + " Your Recipe is Created ", HttpStatus.CREATED);
			
		}

	}

	@PutMapping("/updateRecipe")
	public ResponseEntity<?> updateRecipe(@PathVariable String id, @RequestBody Recipe recipe) throws RecipeNotFoundException {

		if (recipeRepository.existsById(id)) {
			
			recipeService.updateRecipe(id, recipe);
			
			return new ResponseEntity<>("Recipe id : " + id + " updated successfully", HttpStatus.ACCEPTED);
		} 
		else {
			
			throw new RecipeNotFoundException("Recipe id : " + id + " is not found ");
		}
	}

	@DeleteMapping("/deleteMapping")
	public ResponseEntity<String> deleteRecipe(@PathVariable String recipeId) throws RecipeNotFoundException {
		
		 Recipe recipe = recipeService.findByRecipeId(recipeId);
		 
		 if(recipe == null) {
			 throw new RecipeNotFoundException(" Recipe id : "+ recipeId + " is not found ");
		 }
		 else {
			 
		 recipeService.deleteRecipe(recipeId);
		 
		 return new ResponseEntity<>("Recipe id : " + recipeId + " deleted successfully", HttpStatus.OK);
	}
	}

}
