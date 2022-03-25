package com.recipes;

import java.util.List;

import org.springframework.boot.CommandLineRunner;

public class RecipeDataInit implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		 List<String> ingredients = List.of(
				 
	                "2 onion",
	                "2 carrot",
	                "3 chestnut mushrooms",
	                "1 lb minced beef",
	                "2 cloves garlic",
	                "1/2 cup red wine",
	                "3 tbsp tomato puree",
	                "1 beef stock cube",
	                "1/2 tbs salt",
	                "1/2 tbs black pepper",
	                "10 1/2 dried spaghetti or fresh pasta");
		
	}
	
	 String instructions =
             "Heat the oil in a frying pan over a medium-high heat. Add the onion and cook for 5 minutes, stirring often, until the onion softens.\n"
                     + "Add the garlic and cook for a further minute.\n"
                     + "Add the carrot and mushrooms and cook for a further 2-3 minutes.\n"
                     + "Add the minced beef and cook for 5-6 minutes, until browned. Stir often, breaking up any large chunks of meat with a spatula.\n"
                     + "Add the wine. Bring to the boil and let it bubble for 2-3 minutes, until reduced by three quarters.\n"
                     + "Add the tomato puree, beef stock cube, tinned tomatoes, salt and pepper. Stir and bring to the boil. Turn down the heat and simmer for 15 -20 minutes until thickened.\n"
                     + "Meanwhile, boiled a large pan of salted water. Add the spaghetti and cook for 10-12 minutes until al dente.\n"
                     + "Drain the spaghetti and divide between 6 bowls.\n"
                     + "Spoon the bolognese on top of the spaghetti.\n";


}
