package com.example.practise.Controller.Practise;


import com.example.practise.Entity.EmployeSallery;
import com.example.practise.Service.EmployeSalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("EmployeSallery")
public class employeSalleryController {
    @Autowired
    private EmployeSalleryService employeSalleryService;

    @GetMapping
    public List<EmployeSallery>getAll(){
        return  employeSalleryService.findAll();
    }
    @PostMapping
    public ResponseEntity<EmployeSallery> CreateSallery(@RequestBody EmployeSallery employeSallery){
        EmployeSallery createdUser= employeSalleryService.save(employeSallery);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }
}
