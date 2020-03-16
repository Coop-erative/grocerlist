package com.Cooper.grocerylist;

import com.Cooper.grocerylist.models.CategoryDropdownService;
import com.Cooper.grocerylist.models.data.DropdownRepositoryImpl;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatergoryDropDownServiceImpl implements CategoryDropdownService {

        @Autowired(required=true)
        private DropdownRepositoryImpl repository;

        public List<Category> getOptions(String entityName, String nameProp,
                                         String valueProp, String filter) {
            return repository.getOptions(entityName, nameProp, valueProp, filter);
        }

}
