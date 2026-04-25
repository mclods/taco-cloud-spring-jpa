package com.mclods.taco_cloud_spring_jpa.services.impl;

import com.mclods.taco_cloud_spring_jpa.entities.Ingredient;
import com.mclods.taco_cloud_spring_jpa.repositories.IngredientRepository;
import com.mclods.taco_cloud_spring_jpa.services.IngredientService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class IngredientServiceImpl implements IngredientService {

    private final IngredientRepository ingredientRepository;

    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public List<Ingredient> findAllIngredients() {
        var ingredients = ingredientRepository.findAll();
        var ingredientsList = new ArrayList<Ingredient>();

        ingredients.forEach(ingredientsList::add);

        return ingredientsList;
    }

    @Override
    public Optional<Ingredient> findIngredientById(String id) {
        return ingredientRepository.findById(id);
    }
}
