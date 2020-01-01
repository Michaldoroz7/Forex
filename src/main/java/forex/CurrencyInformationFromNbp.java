package forex;

import java.util.LinkedHashMap;
import java.util.List;


public class CurrencyInformationFromNbp implements SelectedService {

    private String table;
    private String currency;
    private String code;
    private List<LinkedHashMap<String, Object>> rates;

    public CurrencyInformationFromNbp() {
    }


    String getTable() {
        return this.table;
    }

    void setTable(String table) {
        this.table = table;
    }

    String getCurrency() {
        return this.currency;
    }

    void setCurrency(String currency) {
        this.currency = currency;
    }

    String getCode() {
        return this.code;
    }

    void setCode(String code) {
        this.code = code;
    }

    List<LinkedHashMap<String, Object>> getRates() {
        return rates;
    }

    @Override
    public String getCurrencyName() {
        return this.currency;
    }

}

