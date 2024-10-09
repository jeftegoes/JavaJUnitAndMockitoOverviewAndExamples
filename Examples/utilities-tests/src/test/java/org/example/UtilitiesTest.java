package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class UtilitiesTest {
    private Utilities utilities;

    @BeforeEach
    public void setup() {
        this.utilities = new Utilities();
    }

    private static Stream<Arguments> removePairsTestConditions() {
        return Stream.of(
                Arguments.of("AABCDDEFF", "ABCDEF"),
                Arguments.of("ABCCABDEEF", "ABCABDEF"),
                Arguments.of("A", "A")
        );
    }

    private static Stream<Arguments> everyNthCharTestConditions() {
        char[] hello = new char[]{'h', 'e', 'l', 'l', 'o'};

        return Stream.of(
                Arguments.of(hello, 2, new char[]{'e', 'l'}),
                Arguments.of(hello, 10, hello)
        );
    }

    @ParameterizedTest
    @MethodSource("everyNthCharTestConditions")
    public void everyNthChar(char[] sourceArray, int n, char[] expected) {
        assertArrayEquals(expected, this.utilities.everyNthChar(sourceArray, n));
    }

    @ParameterizedTest
    @MethodSource("removePairsTestConditions")
    public void removePairs(String source, String expected) {
        assertEquals(this.utilities.removePairs(source), expected);
    }

    @Test
    public void removePairs() {
        assertNull(this.utilities.removePairs(null), "Did not get null returned when argument passed was null.");
    }

    @Test
    public void nullIfOddLength() {
        assertNull(utilities.nullIfOddLength("odd"));
        assertNotNull(utilities.nullIfOddLength("even"));
    }

    @Test
    public void converter() {
        assertEquals(300, utilities.converter(10, 5));
    }

    @Test
    public void converter_ArithmeticException() {
        assertThrows(ArithmeticException.class, () -> {
            utilities.converter(10, 0);
        });
    }
}
