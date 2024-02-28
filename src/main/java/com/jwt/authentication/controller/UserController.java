package com.jwt.authentication.controller;

import com.jwt.authentication.model.User;
import com.jwt.authentication.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/auth/v1")
public class UserController {

    @Autowired
    private UserService userService;


    // We fetch the data from User Table
    @GetMapping("/users")
    public List<User> getUser(){
        return userService.getList(); // return the list Details
    }

    // with the help of this method we can see the User details
    @GetMapping("/current-user")
    public String getLoggedUserId(Principal principal){
        return principal.getName(); //return the name
    }
}
