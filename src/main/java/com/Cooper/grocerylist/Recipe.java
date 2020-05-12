package com.Cooper.grocerylist;

import com.Cooper.grocerylist.models.usrers.User;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Recipe extends AbstractEntity {

    @NotNull
    private String recipe_Name;

    @ManyToOne
    private User user;

    @OneToMany
    @JoinColumn
    private List<Ingredient> ingredients;

    public Recipe(ArrayList<Ingredient> ingredients, String recipe_Name) {
        super();
        this.recipe_Name = recipe_Name;
        this.ingredients = ingredients;
    }

    public Recipe() {}

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getRecipe_Name() {
        return recipe_Name;
    }

    public void setRecipe_Name(String recipe_Name) {
        this.recipe_Name = recipe_Name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
