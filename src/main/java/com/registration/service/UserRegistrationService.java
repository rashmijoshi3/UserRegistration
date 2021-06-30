package com.registration.service;

import com.registration.model.User;
import com.registration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {

    @Autowired
    UserRepository repository;

    @Autowired
    ValidationService validationService;


    public void saveUser(User user) {
        if(!validationService.isValid(user)){
            throw new IllegalArgumentException("User is blacklisted");
        }
        repository.save(user);
    }

}
