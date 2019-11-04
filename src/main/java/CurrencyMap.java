import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.*;

public class CurrencyMap {
    static Object currencies(String currency) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        CurrencyDownloader currencyDownloader = new CurrencyDownloader();
        Map<String, Object> selectedCurrency = currencyDownloader.json(currency);


        LinkedHashMap<String, Object> rates = objectMapper.convertValue(selectedCurrency, LinkedHashMap.class);

        Object ratesObject = rates.get("rates");

        List<String> dupsko = objectMapper.convertValue(ratesObject, List.class);

        Object ratesArray = dupsko.get(0);

        Map<String, Object> ratesMap = objectMapper.convertValue(ratesArray, Map.class);

        Object midRatio = ratesMap.get("mid");

        return midRatio;
    }

}
