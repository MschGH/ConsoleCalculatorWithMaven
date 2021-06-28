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
    public void testSummeZweiPositiveIsOk() { assertTrue(testee.summe(10, 25) == 35); }
    @Test
    public void testSummePositivUndNegativIsOk() {
        assertTrue(testee.summe(30, -10) == 20);
    }
    @Test
    public void testSummeNegativUndPositivIsOk() { assertTrue(testee.summe(-30, 10) == -20); }
    @Test
    public void testSummeNegativUndNegativIsOk() {
        assertTrue(testee.summe(-10, -20) == -30);
    }
    @Test
    public void testSummePositivUndNegativIsOkMinus() {
        assertTrue(testee.summe(10, -30) == -20);
    }
    @Test
    public void testSummeNegativUndPositivIsOkPlus() {
        assertTrue(testee.summe(-10, 30) == 20);
    }
    @Test
    public void testSummeZweiPositiveIsOk100() {
        assertTrue(testee.summe(100, 50) == 150);
    }
    @Test
    public void testSummeZweiPositiveIsOk1000() {
        assertTrue(testee.summe(1000, 500) == 1500);
    }


    @Test
    public void testSubtractionZweiPositiveIsOk() {
        assertTrue(testee.subtraction(25, 10) == 15);
    }
    @Test
    public void testSubtractionPositivUndNegativIsOk() {
        assertTrue(testee.subtraction(15, -10) == 25);
    }
    @Test
    public void testSubtractionNegativUndPositivIsOk() {
        assertTrue(testee.subtraction(-30, 10) == -40);
    }
    @Test
    public void testSubtractionNegativUndNegativIsOk() {
        assertTrue(testee.subtraction(-30, -10) == -20);
    }
    @Test
    public void testSubractionNegativUndNegativIsOkPlus() {
        assertTrue(testee.subtraction(-10, -30) == 20);
    }
    @Test
    public void testSubtractionZweiPositiveIsOkMinus() {
        assertTrue(testee.subtraction(5, 10) == -5);
    }
    @Test
    public void testSubtractionZweiPositive100() {
        assertTrue(testee.subtraction(100, 50) == 50);
    }
    @Test
    public void testSubtractionZweiPositive1000() {
        assertTrue(testee.subtraction(1000, 500) == 500);
    }


    @Test
    public void testDivisionZweiPositive() {
        assertTrue(testee.division(10, 5) == 2);
    }
    @Test
    public void testDivisionPositivUndNegativ() {
        assertTrue(testee.division(10, -5) == -2);
    }
    @Test
    public void testDivisionNegativUndPositiv() {
        assertTrue(testee.division(-10, 5) == -2);
    }
    @Test
    public void testDivisionZweiNegative() {
        assertTrue(testee.division(-10, -5) == 2);
    }
    @Test
    public void testDivisionMaxPositivIsOk() throws ArithmeticException { testee.division(Integer.MAX_VALUE, 2); }
    @Test
    public void testDivisionMaxNegativvIsOk() throws ArithmeticException { testee.division(Integer.MIN_VALUE, 2); }
    @Test
    public void testDivisionNullIsOk() {
        assertTrue(testee.division(0, 5) == 0);
    }
    @Test(expected = ArithmeticException.class)
    public void testDivisionMaxDurchNullIsNotOk() { testee.division(Integer.MAX_VALUE, 0); }

    @Test(expected = ArithmeticException.class)
    public void testDivisionDurchNullIsNotOk() {
        testee.division(10, 0);
    }
    @Test
    public void testArithmeticExceptionNotRaised() throws ArithmeticException { testee.division(10, 0); }

    @Test
    public void testSummeZweiPositiveIsOkProtected() {
        assertTrue(testee.summe1(10, 25) == 35);
    }

    //Private Methoden können nicht getestet werden

    @Test
    public void testDivisionPackageProtected() {
        assertTrue(testee.division1(10, 2) == 5);
    }
}