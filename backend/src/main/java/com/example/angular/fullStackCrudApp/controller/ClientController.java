package com.example.angular.fullStackCrudApp.controller;

import com.example.angular.fullStackCrudApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.angular.fullStackCrudApp.model.User;

import java.util.List;


@CrossOrigin(origins ="http://localhost:4200/")
@RestController
public class ClientController {


    @Autowired
    private UserService userService;

    //Create
    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "User Added Successfully";
    }

    //Read Users
    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }


    //Update User By ID

    @PutMapping("/update/{id}")

    public User updateUserById(@RequestBody User user, @PathVariable("id") long id) {
        return userService.updateUser(user, id);
    }


    //get user by Id

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") long id) {
        return userService.getUserById(id);

    }

    //Delete User

    @DeleteMapping("/delete/{id}")
    public String deleteUSer(@PathVariable("id") long id) {


        userService.deleteUser(id);
        return "User Delete Successfully";

    }
}

