import java.io.IOException;

public class BudgetInSelectedCurrency {
    static int calculateCurr(int budget, String curr) throws IOException {
        String currInString = CurrencyMap.currencies(curr);

        Double currInDouble = Double.parseDouble(currInString);

        double result = budget / currInDouble;

        Long longResult = Math.round(result);

        int roundedResult = Math.toIntExact(longResult);

        return roundedResult;
    }
}
