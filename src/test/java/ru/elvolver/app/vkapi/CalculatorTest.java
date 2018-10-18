package ru.elvolver.app.vkapi;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void add() throws UserException{
        Calculator calculator = new Calculator();
        calculator.add(1, 1);
        Assert.assertEquals(2, calculator.getResult());
    }
    @Test
    public void div() throws UserException{
        Calculator calculator = new Calculator();
        calculator.div(1, 1);
        Assert.assertEquals(1, calculator.getResult());
    }
}