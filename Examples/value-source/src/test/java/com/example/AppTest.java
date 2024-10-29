package com.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest {
    @ParameterizedTest
    @ValueSource(strings = {"Sabrina", "Dora", "Lola"})
    void valueSourceDemonstration(String petName) {
        Assertions.assertNotNull(petName);
    }
}
