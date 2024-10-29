package com.example;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrderByNameTest {
    @Test
    public void testA() {
        System.out.println("Running test A.");
    }

    @Test
    public void testB() {
        System.out.println("Running test B.");
    }

    @Test
    public void testD() {
        System.out.println("Running test D.");
    }

    @Test
    public void testC() {
        System.out.println("Running test C.");
    }
}
