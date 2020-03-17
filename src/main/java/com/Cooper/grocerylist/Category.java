package com.Cooper.grocerylist;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category extends AbstractEntity  {

    private String name;

    @OneToMany
    @JoinColumn
    private final List<Recipe> recipes = new ArrayList<>();

    public Category(String category) {
        this.name = category;
    }

    public Category(){}

    public String getCategory() {
        return name;
    }

    public void setCategory(String category) {
        this.name = category;
    }

    public List<Recipe> getRecipe() {
        return recipes;
    }
}
