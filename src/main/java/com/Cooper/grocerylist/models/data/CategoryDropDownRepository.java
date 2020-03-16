package com.Cooper.grocerylist.models.data;

import com.Cooper.grocerylist.Category;

import java.util.List;

public interface CategoryDropDownRepository {

    List<Category> getOptions(String entityName, String nameProp, String valueProp, String filter);
}
