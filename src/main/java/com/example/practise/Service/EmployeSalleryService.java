package com.example.practise.Service;

import com.example.practise.Entity.EmployeSallery;
import com.example.practise.Entity.User;
import com.example.practise.Repository.EmployeSalleryRepo;
import com.example.practise.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class EmployeSalleryService {
@Autowired
    private EmployeSalleryRepo employeSalleryRepo;
@Autowired
private UserRepo userRepo;
public List<EmployeSallery> findAll(){
    return employeSalleryRepo.findAll();
}

    public EmployeSallery save(EmployeSallery employeSallery) {
        if (employeSallery.getUser() == null || employeSallery.getUser().getId() == 0) {
            throw new RuntimeException("User must be provided");
        }
        User user = userRepo.findById((long) employeSallery.getUser().getId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        employeSallery.setUser(user);
        return employeSalleryRepo.save(employeSallery);
    }}

