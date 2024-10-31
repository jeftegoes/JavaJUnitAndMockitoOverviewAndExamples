package com.example.services;

import com.example.models.User;
import com.example.repositories.UserRepository;

import java.util.UUID;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(String firstName, String lastName, String email, String password, String repeatPassword) {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name is empty.");
        }

        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last name is empty.");
        }

        User user = new User(UUID.randomUUID().toString(), firstName, lastName, email);

        boolean isUserCreated;

        try {
            isUserCreated = userRepository.save(user);
        } catch (RuntimeException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }

        if (!isUserCreated)
            throw new IllegalArgumentException("Could not create user.");

        return user;
    }
}
