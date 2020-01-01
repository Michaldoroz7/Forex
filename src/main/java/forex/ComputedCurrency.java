package forex;

import java.io.IOException;

public interface ComputedCurrency {

     double ComputeCurrency(int budget, String budgetCurrency, String wantedCurrency) throws IOException;
}
