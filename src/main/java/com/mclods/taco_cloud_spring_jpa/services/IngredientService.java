package com.mclods.taco_cloud_spring_jpa.services;

import com.mclods.taco_cloud_spring_jpa.entities.Ingredient;

import java.util.List;
import java.util.Optional;

public interface IngredientService {
    List<Ingredient> findAllIngredients();

    Optional<Ingredient> findIngredientById(String id);
}
