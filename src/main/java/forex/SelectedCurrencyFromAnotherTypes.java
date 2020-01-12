package forex;

import java.util.HashMap;
import java.util.Map;


public class SelectedCurrencyFromAnotherTypes implements ComputedCurrency {

    @Override
    public double ComputeCurrency(int budget, String wantedCurrency, String budgetCurrency) {
        double result = 0;

        if(budgetCurrency.equals("EUR")){
            result = budget * currencyGiverFromEur(wantedCurrency);
        } else if(budgetCurrency.equals("GBP")){
            result = budget * currencyGiverFromGbp(wantedCurrency);
        }
        return result;
    }

    private double currencyGiverFromEur(String wantedCurrency) {

        Map<String, Double> eurCurrenciesMap = new HashMap<>();
        eurCurrenciesMap.put("PLN", 4.2659);
        eurCurrenciesMap.put("USD", 1.1135);
        eurCurrenciesMap.put("GBP", 1.3334);
        eurCurrenciesMap.put("RUB", 83.605);

        return eurCurrenciesMap.get(wantedCurrency);
    }

    private double currencyGiverFromGbp(String wantedCurrency) {

        Map<String, Double> gbpCurrenciesMap = new HashMap<>();
        gbpCurrenciesMap.put("PLN", 5.0);
        gbpCurrenciesMap.put("USD", 1.30);
        gbpCurrenciesMap.put("GBP", 1.17);
        gbpCurrenciesMap.put("RUB", 81.23);

        return gbpCurrenciesMap.get(wantedCurrency);
    }


}
