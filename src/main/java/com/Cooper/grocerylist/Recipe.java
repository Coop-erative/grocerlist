package com.Cooper.grocerylist;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Recipe extends AbstractEntity {

    @ManyToOne
    private Category category;

    @ManyToMany
    private List<Ingredient> ingredients;

    public Recipe(Category category, ArrayList<Ingredient> ingredients) {
        this.category = category;
        this.ingredients = ingredients;

    }

    public Recipe() {}

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
