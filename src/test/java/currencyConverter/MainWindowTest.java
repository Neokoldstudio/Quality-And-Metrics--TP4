package currencyConverter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.util.ArrayList;
// import currencyConverter.Currency;
// import currencyConverter.MainWindow;

public class MainWindowTest {
    private ArrayList<Currency> currencies;

    @BeforeEach
    public void init() {
        currencies = Currency.init();
    }

    // -------------BLACK BOX TESTS-------------
    // @Test
    // public void testConvertCorrectCurrCorrectValues() {
    //     Double[] validValues = { 0.0, 500000.0, 999999.0 };

    //     for (Double i : validValues) {
    //         assertEquals(i * 0.93, MainWindow.convert("US Dollar", "Euro", currencies, i), 0.00001);
    //     }
    // }

    // @Test
    // public void testConvertCorrectCurrWrongValues() {
    //     Double[] invalidValues = { -9000.0, -1.0, 1000001.0, 1500000.0 };

    //     for (Double i : invalidValues) {
    //         assertNotEquals(i * 0.93, MainWindow.convert("US Dollar", "Euro", currencies, i), 0.00001);
    //     }
    // }

    // @Test
    // public void testConvertWrongCurrCorrectValues() {
    //     Double[] validValues = { 1.0, 500000.0, 999999.0 };

    //     for (Double i : validValues) {
    //         assertEquals(0.0, MainWindow.convert("Australian Dollar", "Euro", currencies, i), 0.00001);
    //     }
    // }

    // @Test
    // public void testConvertWrongCurrWrongValues() {
    //     Double[] invalidValues = { -9000.0, -1.0, 1000001.0, 1500000.0 };

    //     for (Double i : invalidValues) {
    //         assertEquals(0.0, MainWindow.convert("Australian Dollar", "Euro", currencies, i), 0.00001);
    //     }
    // }
    // -----------WHITE BOX TESTS---------------

    // @Test
    // public void TestFlowControlChart() { // tests all the branches in the flow control chart

    //     ArrayList<Currency> new_currencies = currencies;

    //     new_currencies.add(new Currency("Brazilian Real", "BRL"));

    //     for (int i = 0; i < currencies1.length; i++) {
    //         if (i == 0)
    //             assertNotEquals(0.0, MainWindow.convert(currencies1[i], currencies2[i], currencies, 100.0), 0.00001);
    //         else
    //             assertEquals(0.0, MainWindow.convert(currencies1[i], currencies2[i], currencies, 100.0), 0.00001);
    //     }
    // }

    // Test conversion for each pair in 'currencies'
    @Test
    public void TestInstructionsCoverage()
    {

        for(Currency i : currencies) {
            for(Currency j : currencies) {
                assertNotEquals(0.0, MainWindow.convert(i.getName(), j.getName(), currencies, 100.0), 0.0001); 
            }

        }
    }

    @Test
    public void TestEdgesCoveragelIf180()
    {

        String incorrect = "Brazilian Real";

        for(Currency i : currencies) {
            assertEquals(0.0, MainWindow.convert(i.getName(), incorrect, currencies, 100.0), 0.0001); 
        }

    }

    @Test
    public void TestEdgesCoverageIf189()
    {

        String incorrect = "Brazilian Real";

        for(Currency i : currencies) {
            assertEquals(0.0, MainWindow.convert(incorrect, i.getName(), currencies, 100.0), 0.0001); 
        }

    }

    @Test
    public void TestEdgesCoverageBothIfs()
    {

        String incorrect = "Brazilian Real";

        assertEquals(0.0, MainWindow.convert(incorrect, incorrect, currencies, 100.0), 0.0001); 

    }

    @Test
    public void TestEdgesCoverageIf187()
    {

        assertEquals(0.0, MainWindow.convert("US Dollar", null, currencies, 100.0), 0.0001); 

    }

    
    @Test
    public void TestPathsLoop1() { // test all the loops values

        for (Currency i: currencies) { // first loop test
            assertNotEquals(0.0, MainWindow.convert(i.getName(), "US Dollar", currencies, 100.0), 0.00001);
        }

    }

    @Test
    public void TestPathsLoop2() { // test all the loops values

        for (Currency i: currencies) { // first loop test
            assertNotEquals(0.0, MainWindow.convert("US Dollar", i.getName(), currencies, 100.0), 0.00001);
        }

    }
    // -----------------------------------------

    @AfterEach
    public void tearDown() {
    }
}

