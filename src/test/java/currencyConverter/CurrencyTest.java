package currencyConverter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
// import currencyConverter.Currency;

public class CurrencyTest {

    // -------------BLACK BOX TESTS-------------
    @Test
    public void testConvertCorrect() {
        Double[] validValues = { 0.0, 500000.0, 999999.0 };

        for (Double i : validValues) {
            assertEquals(i * 0.67, Currency.convert(i, 0.67), 0.00001);
        }
    }

    @Test
    public void testConvertFalse() {
        Double[] invalidValues = { -9000.0, -1.0, 1000001.0, 1500000.0 };

        for (Double i : invalidValues) {
            assertThrows(RuntimeException.class, () -> Currency.convert(i, 0.67));
        }
    }
 }

