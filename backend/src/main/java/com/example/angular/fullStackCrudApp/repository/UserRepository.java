package com.example.angular.fullStackCrudApp.repository;


import com.example.angular.fullStackCrudApp.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {


}
