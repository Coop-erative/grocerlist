package com.Cooper.grocerylist.models.data;

import com.Cooper.grocerylist.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
