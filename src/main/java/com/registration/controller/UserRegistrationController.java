package com.registration.controller;

import com.registration.model.User;
import com.registration.service.ExclusionServiceImpl;
import com.registration.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class UserRegistrationController {

    @Autowired
    UserRegistrationService service;


    @GetMapping("/register")
    public String register(Model model) {

        return "register";
    }

    @PostMapping("/user/register")
    public String registerUser(Model model,
                           @ModelAttribute @Valid User userDetails , BindingResult bindingResult)  {
        List<String> message = new ArrayList<>();

        List<FieldError> errors = bindingResult.getFieldErrors();

        if(bindingResult.hasErrors()){
            for (FieldError e : errors){
                message.add("@" + e.getField().toUpperCase() + ":" + e.getDefaultMessage());
            }
            throw new IllegalArgumentException(message.stream().collect(Collectors.joining(",")));
        }

        service.saveUser(userDetails);

       return "register";
    }
}