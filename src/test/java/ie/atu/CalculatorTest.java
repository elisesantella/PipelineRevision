package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator myCalc;

    @BeforeEach
    void setUp() {
        myCalc = new Calculator();
    }

    @Test
    void testAdd(){
        assertEquals(9, myCalc.add(4,5));
    }

    @Test
    void testSubtract(){
        assertEquals(5, myCalc.subtract(10,5));
    }

    @Test
    void testMultiply(){
        assertEquals(21, myCalc.multiply(7,3));
    }

    @AfterEach
    void tearDown() {
    }
}
