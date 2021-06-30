package com.registration.service;

import com.registration.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExclusionServiceImpl implements ExclusionService{

    private List<User> usersToExclude = new ArrayList<User>(){
        {
            add(new User("adaLovelace", "Analytical3ngineRulz", "10/12/1815", "85385075"));
            add(new User("alanTuring", "eniGmA123", "23/06/1912", "123456789"));
            add(new User("konradZuse", "zeD1", "22/06/1910", "987654321"));
        }
    };

    @Override
    public boolean validate(String dateOfBirth, String ssn) {

        return !usersToExclude.stream().anyMatch(user -> user.getSsn().equals(ssn) && user.getDob().equals(dateOfBirth));

    }
}
