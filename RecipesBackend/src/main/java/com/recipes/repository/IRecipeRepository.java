package com.recipes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.recipes.entity.Recipe;

@Repository
public interface IRecipeRepository extends JpaRepository<Recipe, String>{

	

}
