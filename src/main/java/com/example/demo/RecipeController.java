package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class RecipeController {

    @GetMapping("/api/v1/recipes")
    public List<Recipe> getRecipes() {
        return List.of(
                new Recipe(1L, "Spaghetti Bolognese", 30, "Pasta"),
                new Recipe(2L, "Kürbissuppe", 45, "Suppen"),
                new Recipe(3L, "Pancakes", 15, "Frühstück")
        );
    }
}