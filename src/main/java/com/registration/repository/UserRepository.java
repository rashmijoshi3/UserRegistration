package com.registration.repository;


import com.registration.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository
{

    private List<User> users = new ArrayList<>();

    public void save(User user) {

        users.add(user);
    }
}
