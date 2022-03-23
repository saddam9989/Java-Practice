package com.recipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recipes.entity.Recipe;


public interface IRecipeRepository extends JpaRepository<Recipe, Integer>{

}
