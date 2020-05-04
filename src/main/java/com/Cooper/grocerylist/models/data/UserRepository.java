package com.Cooper.grocerylist.models.data;

import com.Cooper.grocerylist.models.usrers.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String name);

}
