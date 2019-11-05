import java.io.IOException;

public class BudgetInSelectedCurrency {
    static int calculateCurrency(int budget, String currency) throws IOException {
        Object midRatioObject = CurrencyMap.currencies(currency);
        String midRatioString = midRatioObject.toString();
        Double midRatioDouble = Double.valueOf(midRatioString);
        int i = 0;

        double result = budget / midRatioDouble;

        Long longResult = Math.round(result);

        int roundedResult = Math.toIntExact(longResult);

        if (budget < midRatioDouble) {

            return i;
        } else {
            return roundedResult;
        }
    }
}
