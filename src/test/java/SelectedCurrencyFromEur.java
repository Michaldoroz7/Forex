import forex.SelectedCurrencyFromAnotherTypes;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SelectedCurrencyFromEur {

    @Test
    public void PlnShouldGiveCorrectResult() {
        // given

        int budget = 100;

        String budgetCurrency = "EUR";` `
        String plnName = "PLN";

        double plnCurrencyRate = 4.2659;
        double correctResult = budget * plnCurrencyRate;

        SelectedCurrencyFromAnotherTypes selectedCurrencyFromAnotherTypes = new SelectedCurrencyFromAnotherTypes();

        //when
        double result = selectedCurrencyFromAnotherTypes.ComputeCurrency(budget, plnName, budgetCurrency);

        //then
        assertEquals(correctResult, result);
    }
    @Test
    public void UsdShouldGiveCorrectResult(){

        //given
        int budget = 100;

        String budgetCurrency = "EUR";
        String usdName = "USD";

        double usdCurrencyRate = 1.1135;
        double correctResult = budget * usdCurrencyRate;

        SelectedCurrencyFromAnotherTypes selectedCurrencyFromAnotherTypes = new SelectedCurrencyFromAnotherTypes();

        //when
        double result = selectedCurrencyFromAnotherTypes.ComputeCurrency(budget, usdName, budgetCurrency);

        //then
        assertEquals(correctResult, result);

    }
    @Test
    public void GbpShouldGiveCorrectResult(){

        //given
        int budget = 100;

        String budgetCurrency = "EUR";
        String gbpName = "GBP";

        double gbpCurrencyRate = 1.3334;
        double correctResult = budget * gbpCurrencyRate;

        SelectedCurrencyFromAnotherTypes selectedCurrencyFromAnotherTypes = new SelectedCurrencyFromAnotherTypes();

        //when
        double result = selectedCurrencyFromAnotherTypes.ComputeCurrency(budget, gbpName, budgetCurrency);

        //then
        assertEquals(correctResult, result);
    }
    @Test
    public void RubShouldGiveCorrectResult(){

        //given
        int budget = 100;

        String budgetCurrency = "EUR";
        String rubName = "RUB";

        double rubCurrencyRate = 83.605;
        double correctResult = budget * rubCurrencyRate;

        SelectedCurrencyFromAnotherTypes selectedCurrencyFromAnotherTypes = new SelectedCurrencyFromAnotherTypes();

        //when
        double result = selectedCurrencyFromAnotherTypes.ComputeCurrency(budget, rubName, budgetCurrency);

        //then
        assertEquals(correctResult, result);
    }
}
