package com.example.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.models.Game;
import com.example.models.Player;

@ExtendWith(MockitoExtension.class)
public class GameTest {
    @InjectMocks
    Game game;

    @Mock
    Player player;

    @BeforeEach
    void setUp() {

    }

    @Test
    void gameWeaponAttackTest() {
        Mockito.when(player.getWeapon()).thenReturn("Sword");

        Assertions.assertEquals("Player attack with: Sword", game.attack());
    }
}