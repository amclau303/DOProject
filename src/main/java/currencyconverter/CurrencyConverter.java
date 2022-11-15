package currencyconverter;

import java.text.DecimalFormat;

public class CurrencyConverter {

    // Output string for testing
    public String output = "";
    //Output error message
    public String errorMessage;
    public double amount;
    public String currency;

    public CurrencyConverter(String[] args) throws Exception{

        double dollar, pound, euro;

        DecimalFormat f = new DecimalFormat("##.##");

        if (args.length !=2){
            errorMessage="No Input";
            System.out.println("No input");
            return;
        } else {
            currency = args[1].toLowerCase();
        }

        try{
            amount = Integer.parseInt(args[0]);
        }catch (NumberFormatException e) {
            errorMessage = "Amount Error";
            System.out.println("Incorrect amount input");
            return;
        }


        if (!currency.equals("dollars") && !currency.equals("pounds") && !currency.equals("euros")){
            System.out.println("Incorrect currency input.");
            errorMessage = "Currency Error";
            return;
        }

        if (!currency.equals("dollars") && !currency.equals("pounds") && !currency.equals("euros")){
            errorMessage = "Currency Error";
            System.out.println("Incorrect currency input.");
            return;
        }


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
        System.out.println("Thank you for using the converter :).");

    }

}
