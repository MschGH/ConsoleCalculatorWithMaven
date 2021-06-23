package ch.bbw.ms.consolecalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator testee;

    @Before
    public void setUp() {
        testee = new Calculator();
    }

    @Test
    public void testSummeZweiPositiveIsOk() {
        assertTrue(testee.summe(10, 25) == 35);
    }

    @Test
    public void testSummePositivUndNegativIsOk() {
        assertTrue(testee.summe(30, -10) == 20);
    }

    @Test
    public void testSubtractionZweiPositiveIsOk() {
        assertTrue(testee.subtraction(25, 10) == 15);
    }

    @Test
    public void testSubtractionPositivUndNegativIsOk() {
        assertTrue(testee.subtraction(15, -10) == 25);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionDurchNullIsNotOk() {
        testee.division(10, 0);
    }

    @Test
    public void testArithmeticExceptionNotRaised() throws ArithmeticException {
        testee.division(10, 0);
    }
}