import java.io.IOException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        CurrencyDownloader currenyDownloader = new CurrencyDownloader();

        System.out.print("Enter your budget ");
        int budget = input.nextInt();
        System.out.print("Which currency you want?(USD, GBP, CHF, RUB) ");
        String curr = input.next();

        System.out.print("Your budget in " + curr + " is " + BudgetInSelectedCurrency.calculateCurr(budget, curr));

    }
}