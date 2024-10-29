package com.example;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

public class OrderByIndexTest {
    @Order(1)
    @Test
    public void testD() {
        System.out.println("Running test D.");
    }

    @Order(2)
    @Test
    public void testA() {
        System.out.println("Running test A.");
    }

    @Order(3)
    @Test
    public void testC() {
        System.out.println("Running test C.");
    }

    @Order(4)
    @Test
    public void testB() {
        System.out.println("Running test B.");
    }
}
