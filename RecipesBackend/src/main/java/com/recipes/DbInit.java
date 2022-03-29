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

		recipeRepo.save(new Recipe("Chicken Biryani", LocalDateTime.now(), false, 3,
				"Prepare water and chop veggies,Cook biryani on low heat for 5-6 minutes",
				"1 cup boiled basmati rice" + " ," + " salt as required" +  ","  
						+ " 2 tablespoon refined oil" + ","

						+ " 2 onion" + "," + " 1 teaspoon turmeric" + ","  + " 1 tablespoon garlic paste"+ ","
						+ " 1 cup hung curd" + "," + " 2 tablespoon coriander leaves" + "," 
						+ " 1 tablespoon ghee" + "," + " 600 gm chicken"+ "," + " 1 tablespoon garam masala powder "

						
));

		logger.info(" Recipe is added ");
	}

}
