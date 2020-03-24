package com.Cooper.grocerylist;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category extends AbstractEntity  {

    private String category;

    @OneToMany
    @JoinColumn
    private final List<Recipe> categories = new ArrayList<>();

    public Category(String category) {
        this.category = category;
    }

    public Category(){}

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Recipe> getRecipe() {
        return categories;
    }
}
