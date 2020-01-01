package forex;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class CurrencyServiceFromNbp {

      CurrencyInformationFromNbp CurrencyServiceJson(String name) throws IOException {

          ObjectMapper objectMapper = new ObjectMapper();
          return objectMapper.readValue(url(name), CurrencyInformationFromNbp.class);
    }

    private URL url(String name) throws MalformedURLException {
        return new URL("http://api.nbp.pl/api/exchangerates/rates/a/" + name + "/?format=json");
    }
}