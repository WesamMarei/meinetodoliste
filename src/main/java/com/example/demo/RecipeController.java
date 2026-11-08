package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/recipes")
public class RecipeController {

    private final RecipeRepository repository;

    public RecipeController(RecipeRepository repository) {
        this.repository = repository;
        if (repository.count() == 0) {
            repository.saveAll(List.of(
                    new Recipe("Spaghetti Bolognese", 30, "Pasta"),
                    new Recipe("Kürbissuppe", 45, "Suppen"),
                    new Recipe("Pancakes", 15, "Frühstück")
            ));
        }
    }

    @GetMapping
    public List<Recipe> getRecipes() {
        return repository.findAll();
    }

    @PostMapping
    public Recipe createRecipe(@RequestBody Recipe recipe) {
        return repository.save(recipe);
    }
}