package ch.bbw.ms.consolecalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator testee;

    @Test
    public void testSummeZweiPositiveIsOk() {
        testee = new Calculator();
        assertTrue(testee.summe(10, 25) == 35);
    }

    @Test
    public void testSummePositivUndNegativIsOk() {
        testee = new Calculator();
        assertTrue(testee.summe(30, -10) == 20);
    }

    @Test
    public void testSubtractionZweiPositiveIsOk() {
        testee = new Calculator();
        assertTrue(testee.subtraction(25, 10) == 15);
    }

    @Test
    public void testSubtractionPositivUndNegativIsOk() {
        testee = new Calculator();
        assertTrue(testee.subtraction(15, -10) == 25);
    }
}