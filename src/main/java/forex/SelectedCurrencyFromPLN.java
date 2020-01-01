package forex;

import java.io.IOException;

class SelectedCurrencyFromPLN implements ComputedCurrency {

    @Override
    public double ComputeCurrency(int budget, String currencyName, String budgetCurrency) throws IOException {

        double midRatioDouble = CurrencyLoader.giveCurrency(currencyName);
        int result = Math.toIntExact(Math.round(budget / midRatioDouble));

        if (budget < 0) {
            return 0;
        } else {
            return result;
        }
    }
}


