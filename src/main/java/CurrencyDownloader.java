import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

public class CurrencyDownloader {

    public Map<String, Object> json(String name) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();


        URL url = new URL("http://api.nbp.pl/api/exchangerates/rates/a/" + name + "/?format=json");
        Map<String, Object> result = objectMapper.readValue(url, Map.class);


        return result;
    }
}
