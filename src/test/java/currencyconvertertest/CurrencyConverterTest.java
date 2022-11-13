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
    public void test() throws Exception {
        CurrencyConverter currencyConverter = new CurrencyConverter(new String[]{"100", "EUROS"});
        assertEquals("$131 £84", currencyConverter.output);
    }


}
