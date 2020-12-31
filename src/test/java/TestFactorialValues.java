import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestFactorialValues {
    @Test
    public void returnOneForValuesOneAndZero() {
        Factorial factorialValue = new Factorial(0);
        int value = factorialValue.calculate();
        assertEquals(1,value);
    }

    @Test
    public void returnFactorial() {
        Factorial factorialValue = new Factorial(3);
        int value = factorialValue.calculate();
        assertEquals(6,value);

    }

    @Test
    public void throwErrorForNegativeValues() {
        Factorial factorialValue = new Factorial(-10);
        assertThrows(IllegalArgumentException.class,()->factorialValue.calculate());

    }
}
