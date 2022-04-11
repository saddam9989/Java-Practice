package com.recipes;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.validation.constraints.Pattern.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.recipes.entity.Ingredients;
import com.recipes.entity.Recipe;
import com.recipes.repository.IRecipeRepository;

@Component
public class DbInit implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(DbInit.class);

	@Autowired
	private IRecipeRepository recipeRepo;
	

	@Override
	public void run(String... args) throws Exception {
		
	


	}

}
