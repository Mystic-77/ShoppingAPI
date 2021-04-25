package com.mystic.rationdelivery.controller;

import com.mystic.rationdelivery.model.User;
import com.mystic.rationdelivery.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;

@RestController
public class UserController {

    @Autowired
    DatabaseService databaseService;

    //get user
    @GetMapping("/user/{userId}")
    public User getUserDetails(@PathVariable("userId") String userId)
    {
        User user = databaseService.getUserRepository().getUserByRationCardNumber(userId);
        return user;
    }

    @PostMapping("/user")
    public void addUser(@RequestBody User user)
    {
        databaseService.getUserRepository().save(user);
    }

    @PutMapping("/user/{userId}")
    public void updateUserDetails(@RequestBody User user,
                                  @PathVariable("userId") String userId) {
        databaseService.getUserRepository().deleteByRationCardNumber(userId);
        databaseService.getUserRepository().save(user);
    }

    @DeleteMapping("/user/{userId}")
    public void deleteUser(@PathVariable("userId") String userId) {
        User user = databaseService.getUserRepository().getUserByRationCardNumber(userId);
        databaseService.getOrderRepository().deleteAllByBuyer(user);
        databaseService.getUserRepository().deleteByRationCardNumber(userId);
    }
}
