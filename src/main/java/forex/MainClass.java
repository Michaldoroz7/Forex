package forex;

import java.io.IOException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws IOException {

        ComputedCurrency selectedCurrencyFromPLN = new SelectedCurrencyFromPLN();
        SelectedCurrencyFromAnotherCurrencies selectedCurrencyFromAnotherCurrencies = new SelectedCurrencyFromAnotherCurrencies();

        Scanner input = new Scanner(System.in);
        System.out.print("In which currency you have your budget? (PLN, GBP, EUR) ");
        String budgetCurrency = input.next();
        System.out.print("Enter your budget ");
        int budget = input.nextInt();
        System.out.print("Which currency you want?(USD, GBP, RUB, EUR, PLN) ");
        String wantedCurrency = input.next();

        if(budgetCurrency.equals("PLN")) {
            System.out.print("Your budget in " + budgetCurrency + " is " + selectedCurrencyFromPLN.ComputeCurrency(budget, wantedCurrency, budgetCurrency));
        } else if(budgetCurrency.equals("EUR")) {
            System.out.print("Your budget in " + wantedCurrency + " is " + selectedCurrencyFromAnotherCurrencies.ComputeCurrency(budget, wantedCurrency, budgetCurrency));
        } else if(budgetCurrency.equals("GBP")) {
            System.out.print("Your budget in " + wantedCurrency + " is " + selectedCurrencyFromAnotherCurrencies.ComputeCurrency(budget, wantedCurrency, budgetCurrency));
        }
    }
}
