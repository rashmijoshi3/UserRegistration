package com.registration.service;

import com.registration.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidationService {

    @Autowired
    private  ExclusionService exclusionService;

    public boolean isValid(User user){
       return exclusionService.validate(user.getDob(), user.getSsn());
    }

}
