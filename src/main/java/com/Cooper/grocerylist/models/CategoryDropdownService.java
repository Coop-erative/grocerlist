package com.Cooper.grocerylist.models;

import com.Cooper.grocerylist.Category;

import java.util.List;

public interface CategoryDropdownService {
    List<Category> getOptions(String entityName, String nameProp, String valueProp, String filter);
}
