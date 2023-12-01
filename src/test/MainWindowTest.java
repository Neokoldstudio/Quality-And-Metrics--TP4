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

    @Test
    public void testConvert() {
        assertEquals(93.0, MainWindow.convert("US Dollar", "Euro", currencies, 100.0), 0.00001);
    }
}
