package com.Cooper.grocerylist;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ingredient extends AbstractEntity {

    //name & ID = (abstractE), type of measurement here.
    //need to make sure things match up to get away from duplicates?
    // perhaps eventually the entry text that has a drop down
    // menu to show what is already there?

    @ManyToOne
    private Category category;

    @ManyToOne
    private Recipe recipe;

    @NotNull
    private Integer amount;

    @NotNull
    private String measurementType;

    private String ingredient_Name;

    private String ingredient_Note;

    public Ingredient(String measurementType) {
        this.measurementType = measurementType;
    }

    public Ingredient() {}

    public Ingredient(String measurementType, String ingredient_Note, Integer amount, String ingredient_Name) {
        super();
        this.amount = amount;
        this.ingredient_Name = ingredient_Name;
        this.measurementType = measurementType;
        this.ingredient_Note = ingredient_Note;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getMeasurementType() {
        return measurementType;
    }

    public void setMeasurementType(String measurementType) {
        this.measurementType = measurementType;
    }

    public String ingredient_Note() {
        return ingredient_Note;
    }

    public void setIngredientDescription(String ingredient_Note) {
        this.ingredient_Note = ingredient_Note;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getIngredient_Name() {
        return ingredient_Name;
    }

    public void setIngredient_Name(String ingredient_Name) {
        this.ingredient_Name = ingredient_Name;
    }
}
