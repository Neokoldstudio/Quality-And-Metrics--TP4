package test;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.ArrayList;
import currencyConverter.Currency;
import currencyConverter.MainWindow;

public class MainWindowTest {
    private ArrayList<Currency> currencies;

    @Before
    public void init() {
        currencies = Currency.init();
    }

    // -------------BLACK BOX TESTS-------------
    @Test
    public void testConvertCorrectCurrCorrectValues() {
        Double validValues[] = { 0.0, 500000.0, 999999.0 };

        for (Double i : validValues) {
            assertEquals(i * 0.93, MainWindow.convert("US Dollar", "Euro", currencies, i), 0.00001);
        }
    }

    @Test
    public void testConvertCorrectCurrWrongValues() {
        Double invalidValues[] = { -9000.0, -1.0, 1000001.0, 1500000.0 };

        for (Double i : invalidValues) {
            assertNotEquals(i * 0.93, MainWindow.convert("US Dollar", "Euro", currencies, i), 0.00001);
        }
    }

    @Test
    public void testConvertWrongCurrCorrectValues() {
        Double validValues[] = { 1.0, 500000.0, 999999.0 };

        for (Double i : validValues) {
            assertNotEquals(i * 0.60, MainWindow.convert("Australian Dollar", "Euro", currencies, i), 0.00001);
        }
    }

    @Test
    public void testConvertWrongCurrWrongValues() {
        Double invalidValues[] = { -9000.0, -1.0, 1000001.0, 1500000.0 };

        for (Double i : invalidValues) {
            assertNotEquals(i * 0.93, MainWindow.convert("Australian Dollar", "Euro", currencies, i), 0.00001);
        }
    }
    // -----------------------------------------

    @After
    public void tearDown() {
    }
}
