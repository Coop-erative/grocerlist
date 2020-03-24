package com.Cooper.grocerylist.controllers;

import com.Cooper.grocerylist.Recipe;
import com.Cooper.grocerylist.models.RecipeData;
import com.Cooper.grocerylist.models.data.CategoryRepository;
import com.Cooper.grocerylist.models.data.IngredientRepository;
import com.Cooper.grocerylist.models.data.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
@RequestMapping(value = "list")
public class ListController {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private IngredientRepository ingredientRepository;
    @Autowired
    private RecipeRepository recipeRepository;

    static HashMap<String, String> columnChoices = new HashMap<>();

    public ListController () {
        //TODO: Figure out the table output and update these columns
        columnChoices.put("all", "All");
        columnChoices.put("recipe", "Recipe");
        columnChoices.put("ingredient", "Ingredient");
    }

    @RequestMapping("")
    public String list(Model model) {
        model.addAttribute("recipe", recipeRepository.findAll());
        model.addAttribute("ingredient", ingredientRepository.findAll());
        return "list";
    }

    @RequestMapping(value = "recipes")
    public String listRecipesByColumnAndValue(Model model, @RequestParam String column,
                                              @RequestParam String value) {
        Iterable<Recipe> recipes;

        if (column.toLowerCase().equals("all")){
            recipes = recipeRepository.findAll();
            model.addAttribute("title", "All Recipes");
        } else {
            recipes = RecipeData.findByColumnAndValue(column, value, recipeRepository.findAll());
            model.addAttribute("title", "Recipes with " + columnChoices.get(column) + ": " + value);
        }
        model.addAttribute("recipes", recipes);

        return "list-recipes";
    }
}
