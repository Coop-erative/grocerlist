package com.Cooper.grocerylist;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category extends AbstractEntity  {

    public String category_name;

    @OneToMany
    @JoinColumn
    private final List<Ingredient> category = new ArrayList<>();

    public Category(){}

    public List<Ingredient> getCategory() {
        return category;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}
