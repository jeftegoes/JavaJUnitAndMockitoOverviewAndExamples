package com.example.services;

import com.example.models.User;
import com.example.repositories.UserRepository;
import com.example.repositories.UserRepositoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @InjectMocks
    UserServiceImpl userService;

    @Mock
    UserRepositoryImpl userRepository;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String repeatPassword;

    @BeforeEach
    void setUp() {
        userService = new UserServiceImpl(userRepository);
        firstName = "Jefté";
        lastName = "Goes";
        email = "test@test.com";
        password = "123456789";
        repeatPassword = "123456789";
    }

    @DisplayName("User object created")
    @Test
    public void saveCorrectlyTest() {
        User user = userService.createUser(firstName, lastName, email, password, repeatPassword);

        assertNotNull(user, "The createUser() should not have returned null.");
        assertEquals(firstName, user.getFirstName(), "First name is incorrect.");
        assertEquals(lastName, user.getLastName(), "Last name is incorrect");
        assertEquals(email, user.getEmail(), "Email is incorrect.");
        assertNotNull(user.getId(), "User id is missing.");
    }
}
