package com.example.repositories;

import com.example.models.User;

public interface UserRepository {
    boolean save(User user);
}
