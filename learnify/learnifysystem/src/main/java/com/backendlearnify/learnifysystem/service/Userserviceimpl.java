package com.backendlearnify.learnifysystem.service;

import com.backendlearnify.learnifysystem.entity.User;
import com.backendlearnify.learnifysystem.repository.Userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class Userserviceimpl implements Userservice {
    @Autowired
    private Userrepository userrepository;
    @Override
    public User saveUser(User user) {
        return userrepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userrepository.findAll();
    }
}
