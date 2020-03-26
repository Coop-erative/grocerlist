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
        return "index";
    }

    @RequestMapping("add")
    public String displayAddJobForm(Model model) {
        model.addAttribute(new Recipe());
        model.addAttribute("ingredients", ingredientRepository.findAll());
        model.addAttribute("recipes", recipeRepository.findAll());
        model.addAttribute("categories", categoryRepository.findAll());
        return "add";
    }

    @PostMapping("add")
    public String processAddRecipeForm(@ModelAttribute @Valid Recipe newRecipe,
                                    Errors errors, Model model, @RequestParam Integer categoryId,
                                    @RequestParam List<Integer> ingredient) {
//need to update to reciepe from category....category and ingred
        if (errors.hasErrors()) {
            return "add";
        }

        //Create a new instance of Employer, set equal to employer Repository  and then save to job repository
        Category category = categoryRepository.findById(categoryId).orElse(new Category());
        newRecipe.setCategory(category);

        List<Ingredient> ingredientObject = (List<Ingredient>) ingredientRepository.findAllById(ingredient);
        newRecipe.setIngredients(ingredientObject);

        recipeRepository.save(newRecipe);

        return "redirect:/index";
    }


}
