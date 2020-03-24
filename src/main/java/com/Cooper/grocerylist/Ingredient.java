package com.Cooper.grocerylist;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
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

    @ManyToMany(mappedBy = "ingredients")
    @NotNull
    private final List<Recipe> recipes = new ArrayList<>();

    @NotNull
    private String measurementType;

    public Ingredient(String measurementType) {
        this.measurementType = measurementType;
    }

    public Ingredient() {}

    public String getMeasurementType() {
        return measurementType;
    }

    public void setMeasurementType(String measurementType) {
        this.measurementType = measurementType;
    }
}
