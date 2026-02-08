package com.ecommerse.shopify.service;

import com.ecommerse.shopify.model.User;
import com.ecommerse.shopify.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        // space for logic of redandant email entries
        return userRepository.save(user);
    }

    public String login(String username, String rawPassword) {
    // Search by username instead of email
    User user = userRepository.findByUsername(username);
    
    // Using simple string comparison since we skipped encryption for now
    if (user != null && user.getPassword_hash().equals(rawPassword)) {
        user.setLast_login(java.time.LocalDateTime.now());
        userRepository.save(user);
        return "Login Successful!";
    }
    return "Invalid credentials!";
}
}