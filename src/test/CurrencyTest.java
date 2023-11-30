package test;

import currencyConverter.Currency;
import org.junit.Test;
import static org.junit.Assert.*;

public class CurrencyTest {
    @Test
    public void testConvertCorrect() {
        assertEquals(67.0, Currency.convert(100.0, 0.67), 0.00001);
    }

    @Test
    public void testConvertFalse() {
        assertNotEquals(50, Currency.convert(100.0, 0.25), 0.00001);
    }
}