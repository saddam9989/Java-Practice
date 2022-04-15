package com.recipes.controllers;

import java.util.List;
import java.util.Optional;

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
	public ResponseEntity<?> getAllRecipes() throws RecipeNotFoundException {

		if (!recipeRepository.findAll().isEmpty()) {

			return new ResponseEntity<>(recipeService.recipesList(), HttpStatus.OK);

		} else {

			throw new RecipeNotFoundException("No recipes in the list ");

		}
	}

	@PostMapping("/addRecipe")
	public ResponseEntity<?> createRecipe(@RequestBody Recipe recipe) throws RecipeNotFoundException {

		Optional<Recipe> opt = recipeRepository.findByName(recipe.getName());

		if (opt.isPresent()) {
			throw new RecipeNotFoundException("Recipe is already created ");

		} else {

			recipeService.addRecipe(recipe);

			return new ResponseEntity<>(" Recipe is added in the list ", HttpStatus.CREATED);

		}
	}

	@PutMapping("/updateRecipe/{recipeId}")
	public ResponseEntity<?> updateRecipe(@RequestBody Recipe recipe) throws RecipeNotFoundException {

		if (recipeRepository.existsById(recipe.getRecipeId())) {

			recipeService.updateRecipe(recipe);

			return new ResponseEntity<>(" Recipe Id " + recipe.getRecipeId() + " is updated successfully ",
					HttpStatus.ACCEPTED);

		} else {
			throw new RecipeNotFoundException("Recipe Id " + recipe.getRecipeId() + " is not found ");
		}

	}

	@DeleteMapping("/deleteMapping/{recipeId}")
	public ResponseEntity<String> deleteRecipe(@PathVariable("recipeId") int recipeId) throws RecipeNotFoundException {

		Optional<Recipe> opt = recipeRepository.findById(recipeId);

		if (opt.isPresent()) {

			recipeService.deleteRecipe(recipeId);

			return new ResponseEntity<>("Recipe id : " + recipeId + " is deleted successfully", HttpStatus.OK);
		} else {

			throw new RecipeNotFoundException(" Recipe id : " + recipeId + " is not found ");

		}
	}

	@GetMapping("/{recipeId}")
	public ResponseEntity<?> getRecipe(@PathVariable("recipeId") int recipeId) throws RecipeNotFoundException {

		Optional<Recipe> opt = recipeRepository.findById(recipeId);

		if (opt.isPresent()) {

			return new ResponseEntity<>( recipeService.getRecipe(recipeId), HttpStatus.OK);

		}

		else {

			throw new RecipeNotFoundException(" Recipe id : " + recipeId + " is not found ");
		}

	}

}
