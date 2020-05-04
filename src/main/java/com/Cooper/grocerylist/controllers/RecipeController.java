package com.Cooper.grocerylist.controllers;

import com.Cooper.grocerylist.Category;
import com.Cooper.grocerylist.Ingredient;
import com.Cooper.grocerylist.Recipe;
import com.Cooper.grocerylist.models.data.CategoryRepository;
import com.Cooper.grocerylist.models.data.IngredientRepository;
import com.Cooper.grocerylist.models.data.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class RecipeController {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private IngredientRepository ingredientRepository;
    @Autowired
    private RecipeRepository recipeRepository;

    @RequestMapping("")
    public String index(Model model) {
       model.addAttribute("recipe", recipeRepository.findAll());

        return "index";
    }

}
