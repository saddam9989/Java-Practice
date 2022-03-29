package com.recipes;

import java.time.LocalDateTime;

import javax.validation.constraints.Pattern.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.recipes.entity.Recipe;
import com.recipes.repository.IRecipeRepository;


@Component
public class DbInit implements CommandLineRunner {
	
	Logger logger = LoggerFactory.getLogger(DbInit.class);
	
	@Autowired
	private IRecipeRepository recipeRepo;

	@Override
	public void run(String... args) throws Exception {
		
		logger.info(" Deleted All ");
		
		 
		
		recipeRepo.save(new Recipe("chicken", LocalDateTime.now(), false, 3, " boiled oil first and add chicken",null ));
		
		logger.info(" Recipe is added ");
	}
	
	
	

}
