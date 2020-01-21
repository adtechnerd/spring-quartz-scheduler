package com.learning.rest;

import com.learning.model.User;
import com.learning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/all")
    public List<User> getAllUsers() {
        System.out.println("inside controller");
        List<User> allUsers = service.getAllUsers();
        System.out.println("Got all users: " + allUsers.size());
        if(allUsers != null) {
            allUsers.forEach(user -> {
                System.out.println(user.getName());
            });
        }
        System.out.println("leaving controller");
        return allUsers;
    }
}
