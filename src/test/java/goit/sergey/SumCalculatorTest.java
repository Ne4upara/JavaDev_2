package goit.sergey;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator calc;

    @BeforeEach
    public void beforeEach(){
        calc = new SumCalculator();
    }

    @Test
    public void testThatNegative(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.sum(0));
    }

    @Test
    public void testThat1SumCalculator(){
        Assertions.assertEquals(1, calc.sum(1));
    }
    @Test
    public void testThat2SumCalculator(){
        Assertions.assertEquals(6, calc.sum(3));    }

    @Test
    public void testThatMaxInput(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.sum(65537));
    }

}