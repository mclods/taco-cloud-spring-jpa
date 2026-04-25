package com.mclods.taco_cloud_spring_jpa.repositories;

import com.mclods.taco_cloud_spring_jpa.entities.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
