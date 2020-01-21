package com.learning.service;

import com.learning.model.User;
import com.learning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        List<com.learning.repoModel.User> usersRepo = repository.findAll();
        System.out.println("From db: " +usersRepo.size());
        convert(users, usersRepo);
        return users;
    }

    private void convert(List<User> users, List<com.learning.repoModel.User> userRepo) {
        System.out.println("got from db: " + userRepo.size());
        userRepo.forEach(userRe -> {
            User userConv = new User(userRe.getName(), userRe.getAge());
            System.out.println(userRe.getName());
            users.add(userConv);
        });
    }
}
