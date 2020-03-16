package com.Cooper.grocerylist.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {
//    @Autowired
//    private RecipeRepository recipeRepository;

    @RequestMapping("")
    public String index(Model model) {
        return "index";
    }

}
