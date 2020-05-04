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
    private String measurementType;

    private String ingredientDescription;

    public Ingredient(String measurementType) {
        this.measurementType = measurementType;
    }

    public Ingredient() {}

    public Ingredient(String measurementType, String ingredientDescription) {
        super();
        this.measurementType = measurementType;
        this.ingredientDescription = ingredientDescription;
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

    public String getIngredientDescription() {
        return ingredientDescription;
    }

    public void setIngredientDescription(String ingredientDescription) {
        this.ingredientDescription = ingredientDescription;
    }
}
