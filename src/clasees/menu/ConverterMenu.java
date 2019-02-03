package clasees.menu;

import clasees.CurrencyConverter;

import java.util.Scanner;

public class ConverterMenu implements ConverterMenuInterface {
    private String fromMessage = "Type id of currency you want to convert from (1: PLN, 2: USD, 3: EUR): ";
    private String toMessage = "Type id of currency you want to convert to (1: PLN, 2: USD, 3: EUR): ";
    private String amountMessage = "Type the amount of mony you want to convert: ";
    private int from;
    private int to;
    private double amount;

    @Override
    public int chooseCurrency(String message) {
        System.out.println(message);
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();
    }

    @Override
    public Double chooseAmount() {
        System.out.println(amountMessage);
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextDouble();
    }

    @Override
    public void displayMenu() {
        from = chooseCurrency(fromMessage);
        to = chooseCurrency(toMessage);
        amount = chooseAmount();
        CurrencyConverter converter = new CurrencyConverter(from, to, amount);
        System.out.println("Converted amount is: " + converter.Convert() + " " + converter.getTo());
    }
}
