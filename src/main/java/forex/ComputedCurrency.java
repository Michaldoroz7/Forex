package forex;

import java.io.IOException;

public interface ComputedCurrency {

    public double ComputeCurrency(int budget, String currency) throws IOException;
}
