package com.mejner.recipeapp.repositories;

import com.mejner.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipieRepository extends CrudRepository<Recipe, Long> {
}
