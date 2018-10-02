package test;

import main.Calculator;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    public void testNewCalculatorHasAnAccumulatorOfZero(){
        Calculator calculator = new Calculator();
        assertEquals(BigDecimal.ZERO, calculator.getAccumulator());


    }
}
