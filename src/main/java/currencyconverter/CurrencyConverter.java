package currencyconverter;

import java.text.DecimalFormat;

public class CurrencyConverter {

    public String output = "";

    public CurrencyConverter(String[] args) throws Exception{

        double amount, dollar, pound, code, euro;

        DecimalFormat f = new DecimalFormat("##.##");

        amount = Integer.parseInt(args[0]);
        String currency = args[1].toLowerCase();



        // For amounts Conversion
        switch (currency){
            case "dollars" :
                // For Dollar Conversion
                pound = amount * 0.74;
                System.out.println(amount + " Dollars = " + f.format(pound) + " Pounds");
                euro = amount * 0.88;
                System.out.println(amount + " Dollars = " + f.format(euro) + " Euros");
                this.output = "£" + pound + " €" + euro;
                break;
            case "pounds":
                // For Pound Conversion
                dollar = amount * 1.36;
                System.out.println(amount + " Pounds = " + f.format(dollar) + " Dollars");
                euro = amount * 1.19;
                System.out.println(amount + " Pound = " + f.format(euro) + " Euros");
                this.output = "$" + dollar + " €" + euro;
                break;
            case "euros":
                // For Euro Conversion
                dollar = amount * 1.31;
                System.out.println(amount + " Euros = " + f.format(dollar) + " Dollars");
                pound = amount * 0.84;
                System.out.println(amount + " Euros = " + f.format(pound) + " Pounds");
                this.output = "$" + f.format(dollar) + " £" + f.format(pound);
                break;
        }
        System.out.println("Thank you for using the converter.");

    }

}
