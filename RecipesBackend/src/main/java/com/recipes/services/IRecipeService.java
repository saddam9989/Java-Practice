package com.recipes.services;

import com.recipes.entity.Recipe;

public interface IRecipeService {

	public void getAll();

	public void get(String id);

	public void create(Recipe recipe);

	public void update(Recipe recipe);

	public void delete(String id);

}
