import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;
    private Object Calculator;

    @BeforeEach
    void setUp() {
        Calculator = new Calculator();
    }

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int a = 1;
        int b= 2;
        double result = calculator.add(a,b);
        Assertions.assertEquals(3,result);
    }

    @Test
    void subtract() {
        final Calculator calculator = new Calculator();
        int a = 1;
        int b = 2;
        //double subtract = calculator.subtract(b,a);
        Assertions.assertEquals(1, calculator.subtract(b, a));
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }

    @Test
    void modulo() {
    }

    @Test
    void sum() {
    }
}