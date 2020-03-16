package com.Cooper.grocerylist;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Recipe extends AbstractEntity {
    @NotNull
    private String title;

    public Recipe(String title) {
        this.title = title;
    }

    public Recipe() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
