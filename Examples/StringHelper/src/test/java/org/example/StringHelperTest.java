package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class StringHelperTest {
    StringHelper stringHelper;

    @BeforeEach
    public void setup() {
        stringHelper = new StringHelper();
    }

    private static Stream<Arguments> truncateAInFirst2PositionsConditions() {
        return Stream.of(
                Arguments.of("AACD", "CD"),
                Arguments.of("CDAA", "CDAA"),
                Arguments.of("ACDB", "CDB")
        );
    }

    @ParameterizedTest
    @MethodSource("truncateAInFirst2PositionsConditions")
    public void truncateAInFirst2Positions(String str, String expected) {
        assertEquals(expected, stringHelper.truncateAInFirst2Positions(str));
    }

    @Test
    public void areFirstAndLasTwoCharactersTheSame() {
        assertFalse(stringHelper.areFirstAndLasTwoCharactersTheSame("ABCD"));
        assertTrue(stringHelper.areFirstAndLasTwoCharactersTheSame("ABAB"));
        assertTrue(stringHelper.areFirstAndLasTwoCharactersTheSame("AB"));
        assertFalse(stringHelper.areFirstAndLasTwoCharactersTheSame("A"));
    }
}
