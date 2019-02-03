package clasees.menu;

import clasees.CurrencyConverter;

import java.util.Scanner;

public class MainMenu implements MainMenuInterface{
    private String menuText =
            "Welcome to CurrencyConverter. Enter number of operation wou want to execute:" +
            "\n1. Convert money;" +
            "\n2. Display available currencies;" +
            "\n3. Close application;";
    private int chosenOption;

    @Override
    public void chooseMenuOption() {
        chosenOption = scanInt();
        switch (chosenOption) {
            case 1: {
                new ConverterMenu().displayMenu();
                break;
            }
            case 2: {
                CurrencyConverter converter = new CurrencyConverter();
                System.out.println(converter.getRates());
                break;
            }
            case 3: {
                break;
            }
        }
    }

    @Override
    public void displayMenu() {
        while(chosenOption != 3) {
            System.out.println(menuText);
            chooseMenuOption();
        }
    }

    @Override
    public int scanInt() {
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();
    }
}
