package forex;

import java.io.IOException;

class BudgetInSelectedCurrency implements ComputedCurrency {

    public double calculatedCurrency(int budget, String currency) throws IOException {

        double result = ComputeCurrency(budget, currency);
        return result;
    }

    @Override
    public double ComputeCurrency(int budget, String currency) throws IOException {

        Object midRatioObject = CurrencyLoader.currencyGetter(currency);
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