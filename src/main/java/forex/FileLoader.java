package forex;

import java.util.LinkedHashMap;
import java.util.List;


public class FileLoader {

    private String table;
    private String currency;
    private String code;
    private List<LinkedHashMap<String, Object>> rates;

    public FileLoader() {
    }


    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<LinkedHashMap<String, Object>> getRates() {
        return rates;
    }
}


