package com.Cooper.grocerylist.controllers;

import com.Cooper.grocerylist.Category;
import com.Cooper.grocerylist.models.data.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("categories")
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    
    @GetMapping("add")
    public String displayaddCategoryForm(Model model) {
        model.addAttribute(new Category());
        return "categories/add";
    }

//    @PostMapping("add")
//    public String processAddCategoryForm() {
//
//    }

}
