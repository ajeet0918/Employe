package com.example.practise.Service;


import com.example.practise.Entity.User;
import com.example.practise.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userservice {
    @Autowired
    private UserRepo userRepo;
    public List<User> findAll(){
        return userRepo.findAll();
    }
    public User save(User user){
        return userRepo.save(user);
    }
}
