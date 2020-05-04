package com.Cooper.grocerylist;

import com.Cooper.grocerylist.models.usrers.User;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Recipe extends AbstractEntity {

    @ManyToOne
    private User user;

    @OneToMany
    @JoinColumn
    private List<Ingredient> ingredients;

    public Recipe(ArrayList<Ingredient> ingredients) {
        super();
        this.ingredients = ingredients;
    }

    public Recipe() {}

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
