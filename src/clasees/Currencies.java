package clasees;

import java.util.HashMap;
import java.util.Map;

public class Currencies {
    Map<String, Double> currencyMap;

    public Map<String, Double> getCurrencyMap() {
        return currencyMap;
    }

    public void setCurrencyMap(Map<String, Double> currencyMap) {
        this.currencyMap = currencyMap;
    }

    public void fillMap() {
        currencyMap = new HashMap<>();
        currencyMap.put("PLN", 1.00);
        currencyMap.put("EUR", 4.28);
        currencyMap.put("USD", 3.74);
    }

    @Override
    public String toString() {
        return "Currencies{" +
                "currencyMap=" + currencyMap +
                '}';
    }
}
