package com.example.angular.fullStackCrudApp.service;


import com.example.angular.fullStackCrudApp.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {



    //create
    public User addUser(User user);


    //read
    public List<User> getUsers();

    public User getUserById(Long id);

    //delete
    public void deleteUser(long id);

    //udpate
    public User updateUser(User user, long id);
}
