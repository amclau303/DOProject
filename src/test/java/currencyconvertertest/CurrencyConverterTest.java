package currencyconvertertest;
import currencyconverter.CurrencyConverter;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class CurrencyConverterTest {

    @Test
    public void testNormalInput() throws Exception {
        CurrencyConverter currencyConverter = new CurrencyConverter(new String[]{"100", "euros"});
        assertEquals("$131 £84", currencyConverter.output);
    }

    @Test
    public void testTextManipulation() throws Exception {
        CurrencyConverter currencyConverter = new CurrencyConverter(new String[]{"1", "EUROS"});
        assertEquals("$1.31 £0.84", currencyConverter.output);

        currencyConverter = new CurrencyConverter(new String[]{"1", "dOllArS"});
        assertEquals("£0.74 €0.88", currencyConverter.output);

        currencyConverter = new CurrencyConverter(new String[]{"1", "Pounds"});
        assertEquals("$1.36 €1.19", currencyConverter.output);
    }

    @Test
    public void testNoInput() throws Exception {
        CurrencyConverter currencyConverter = new CurrencyConverter(new String[]{});
        assertEquals("No Input", currencyConverter.errorMessage);
    }

    @Test
    public void testRandomCharacter() throws Exception {
        CurrencyConverter currencyConverter = new CurrencyConverter(new String[]{"1", "aaa"});
        assertEquals("Currency Error", currencyConverter.errorMessage);
    }

    @Test
    public void testRandomAmount() throws Exception {
        CurrencyConverter currencyConverter = new CurrencyConverter(new String[]{"aaa", "dollars"});
        assertEquals("Amount Error", currencyConverter.errorMessage);
    }

    @Test
    public void testLargeAmount() throws Exception {
        CurrencyConverter currencyConverter = new CurrencyConverter(new String[]{"1000", "dollars"});
        assertEquals("£740.0 €880.0", currencyConverter.output);
    }
}
