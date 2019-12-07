package forex;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

public class CurrencyLoader {
    static Object currencyGetter(String name) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        FileDownloader fileDownloader = new FileDownloader();

        FileLoader result = fileDownloader.json(name);
        List ratesList = result.getRates();
        Object ratesMap = ratesList.get(0);
        LinkedHashMap<String, Object> ratesHash = objectMapper.convertValue(ratesMap, LinkedHashMap.class);
        Object midRatio = ratesHash.get("mid");

        return midRatio;
    }
}


