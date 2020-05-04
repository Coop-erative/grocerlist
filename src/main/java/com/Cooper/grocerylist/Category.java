package com.Cooper.grocerylist;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category extends AbstractEntity  {

    //Using name to represent categoryName

    @OneToMany
    @JoinColumn
    private final List<Ingredient> category = new ArrayList<>();

    public Category(){}

    public List<Ingredient> getCategory() {
        return category;
    }
}
