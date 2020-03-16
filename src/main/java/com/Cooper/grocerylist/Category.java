package com.Cooper.grocerylist;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category extends AbstractEntity  {

    private String name;
    private String value;

    @ManyToOne
    @JoinColumn
    private final List<Recipe> Recipe = new ArrayList<>();

    public Category(String category, String value) {
        this.name = category;
        this.value = value;
    }

    public Category(){}

    public String getCategory() {
        return name;
    }

    public void setCategory(String category) {
        this.name = category;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<com.Cooper.grocerylist.Recipe> getRecipe() {
        return Recipe;
    }
}
