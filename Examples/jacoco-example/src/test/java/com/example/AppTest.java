package com.example;

import com.example.entities.Calculator;
import org.junit.jupiter.api.*;

import java.io.*;

public class AppTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));

        App app = new App();
    }

    @Test
    public void testMainMethod() throws IOException {
        InputStream inputStream1 = new ByteArrayInputStream("10\n20\n+\n".getBytes());
        System.setIn(inputStream1);

        App.main(new String[]{});

        Assertions.assertEquals("Inform first Operand: Inform second Operand: Now the mathematical mathematicalOperator: Calculator resul: 30.0", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
