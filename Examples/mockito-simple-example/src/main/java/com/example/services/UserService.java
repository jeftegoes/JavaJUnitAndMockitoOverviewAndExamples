package com.example.services;

import com.example.models.User;

public interface UserService {
    User createUser(String firstName, String lastName, String mail, String password, String repeatPassword);
}
