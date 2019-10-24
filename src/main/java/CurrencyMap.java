import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

public class CurrencyMap {
    static String currencies(String curr) throws IOException {

        CurrencyDownloader currencyDownloader = new CurrencyDownloader();
        Map<String, Object> selectedCurrency = currencyDownloader.json(curr);

        String mapAsString = selectedCurrency.keySet().stream()
                .map(key -> key + "=" + selectedCurrency.get(key))
                .collect(Collectors.joining(", ", "{", "}"));

        int beginIndex = mapAsString.length() - 9;
        int lastIndex = mapAsString.length() - 3;

        String result = mapAsString.substring(beginIndex, lastIndex);

        return result;
    }
}
