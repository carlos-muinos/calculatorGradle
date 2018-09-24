package com.privalia.business.integration.test;

import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

import com.privalia.business.Calculator;
import com.privalia.business.ICalculator;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CalculatorParametrizedTest {
    private ICalculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    @Parameters({ "0,0,0", "1,1,2" })
    public void shouldReturnCorrectSum(int first, int second, int expectedSum) {

        assertEquals(calculator.sum(first, second), expectedSum);
    }

    @Test
    @Parameters({ "4,2,2", "4,1,3" })
    public void shouldReturnCorrectSubstract(int first, int second, int expectedSub) {

        assertEquals(calculator.substract(first, second), expectedSub);
    }

    @Test
    @Parameters({ "4,6,24", "3,5,15" })
    public void shouldReturnCorrectMultiply(int first, int second, int expectedMul) {

        assertEquals(calculator.multiply(first, second) , expectedMul);
    }

    @Test
    @Parameters({ "25,5,5", "10,2,5" })
    public void shouldReturnCorrectDivide(int first, int second, int expectedDiv) {

        assertEquals(calculator.divide(first, second), expectedDiv);
    }
}