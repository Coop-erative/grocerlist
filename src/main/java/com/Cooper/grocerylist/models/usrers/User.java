package com.Cooper.grocerylist.models.usrers;

import com.Cooper.grocerylist.AbstractEntity;
import com.Cooper.grocerylist.Ingredient;
import com.Cooper.grocerylist.Recipe;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class User extends AbstractEntity {

    @OneToMany
    @JoinColumn
    private List<Recipe> recipes;

    @NotNull
    private String username;

    @NotNull
    private String pwHash;

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public User() {}

    public User(String username, String password) {
        this.username = username;
        this.pwHash = encoder.encode(password);
    }

    public String getUsername() {
        return username;
    }

    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, pwHash);
    }

}
