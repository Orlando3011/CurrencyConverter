package clasees;

import java.util.Map;

public class CurrencyConverter implements CurrencyInterface {
    private Currencies currencies;
    private String from;
    private String to;
    private double amount;

    public CurrencyConverter(int from, int to, double amount) {
        this.currencies = new Currencies();
        this.currencies.fillMap();
        this.amount = amount;
        this.from = encodeCurrency(from);
        this.to = encodeCurrency(to);
    }

    public CurrencyConverter() {
        this.currencies = new Currencies();
        this.currencies.fillMap();
    }

    @Override
    public double Convert() {
        Map<String, Double> currencyMap = currencies.getCurrencyMap();
        return amount/currencyMap.get(from)*currencyMap.get(to);
    }

    @Override
    public String getRates() {
        return currencies.toString();
    }

    @Override
    public String encodeCurrency(int currencyId) {
        switch (currencyId) {
            case 1:
                return "PLN";
            case  2:
                return "USD";
            case 3:
                return "EUR";
            default:
                return "";
        }
    }

    public Currencies getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Currencies currencies) {
        this.currencies = currencies;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
