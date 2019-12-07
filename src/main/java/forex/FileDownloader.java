package forex;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;

public class FileDownloader {

    public FileLoader json(String name) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        URL url = new URL("http://api.nbp.pl/api/exchangerates/rates/a/" + name + "/?format=json");
        FileLoader result = objectMapper.readValue(url, FileLoader.class);

        return result;
    }
}