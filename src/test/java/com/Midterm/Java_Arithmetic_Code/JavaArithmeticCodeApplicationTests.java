package com.Midterm.Java_Arithmetic_Code;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class JavaArithmeticCodeApplicationTests{
	@Test
	public void testClassInstantiation(){
	    // Just create an instance to cover the class declaration
	    new JavaArithmeticCodeApplication();
	}

    @Test
    public void testAddition() {
        assertEquals(8, JavaArithmeticCodeApplication.add(5, 3), "5 + 3 should equal 8");
        assertEquals(-2, JavaArithmeticCodeApplication.add(-5, 3), "-5 + 3 should equal -2");
        assertEquals(0, JavaArithmeticCodeApplication.add(0, 0), "0 + 0 should equal 0");
        assertEquals(100, JavaArithmeticCodeApplication.add(50, 50), "50 + 50 should equal 100");
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, JavaArithmeticCodeApplication.subtract(5, 3), "5 - 3 should equal 2");
        assertEquals(-8, JavaArithmeticCodeApplication.subtract(-5, 3), "-5 - 3 should equal -8");
        assertEquals(0, JavaArithmeticCodeApplication.subtract(0, 0), "0 - 0 should equal 0");
        assertEquals(-50, JavaArithmeticCodeApplication.subtract(0, 50), "0 - 50 should equal -50");
    }

    @Test
    public void testMultiplication() {
        assertEquals(15, JavaArithmeticCodeApplication.multiply(5, 3), "5 * 3 should equal 15");
        assertEquals(-15, JavaArithmeticCodeApplication.multiply(-5, 3), "-5 * 3 should equal -15");
        assertEquals(0, JavaArithmeticCodeApplication.multiply(0, 3), "0 * 3 should equal 0");
        assertEquals(100, JavaArithmeticCodeApplication.multiply(10, 10), "10 * 10 should equal 100");
    }

    @Test
    public void testDivision() {
        assertEquals(2, JavaArithmeticCodeApplication.divide(6, 3), "6 / 3 should equal 2");
        assertEquals(-2, JavaArithmeticCodeApplication.divide(-6, 3), "-6 / 3 should equal -2");
        assertEquals(0, JavaArithmeticCodeApplication.divide(0, 3), "0 / 3 should equal 0");
        assertThrows(ArithmeticException.class, () -> JavaArithmeticCodeApplication.divide(5, 0), "Division by zero should throw an exception");
    }

    @Test
    public void testMainMethod() {
        // Capture the output of the main method
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the main method
        JavaArithmeticCodeApplication.main(new String[]{});

        // Restore the original output stream
        System.setOut(originalOut);

        // Check the output
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Welcome to Java Arithmetic Code!"));
        assertTrue(output.contains("Addition: 8"));
        assertTrue(output.contains("Subtraction: 2"));
        assertTrue(output.contains("Multiplication: 15"));
        assertTrue(output.contains("Division: 2"));
    }
}
