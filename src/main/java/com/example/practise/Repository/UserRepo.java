package com.example.practise.Repository;

import com.example.practise.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> { }
