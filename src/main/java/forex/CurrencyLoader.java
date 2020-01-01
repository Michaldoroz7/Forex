package forex;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.LinkedHashMap;

public class CurrencyLoader {
    static double giveCurrency(String name) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        CurrencyServiceFromNbp currencyServiceFromNbp = new CurrencyServiceFromNbp();
        CurrencyInformationFromNbp selectedCurrency = currencyServiceFromNbp.CurrencyServiceJson(name);
        Object ratesMap = selectedCurrency.getRates().get(0);
        LinkedHashMap<String, Object> ratesHash = objectMapper.convertValue(ratesMap, LinkedHashMap.class);
        Object midRatio = ratesHash.get("mid");
        Double midRatioDouble = Double.valueOf(midRatio.toString());

        return midRatioDouble;
    }
}


