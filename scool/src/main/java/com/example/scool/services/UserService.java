package com.example.scool.services;

import com.example.scool.models.User;
import com.example.scool.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

@RequiredArgsConstructor
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }


    public User addUser(User user) {
        return userRepository.save(user);
    }


    public User updateUser(User user) {
        return userRepository.save(user);
    }


    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}