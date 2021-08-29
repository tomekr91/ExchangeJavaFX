package model;

import java.math.BigDecimal;

public class InputValues {
    String yourCurrency = "PLN";
    String targetCurrency = "PLN";
    String key = "PLNtoPLN";
    BigDecimal amount;
    boolean buyOrSell = true;

    public String getYourCurrency() {
        return yourCurrency;
    }

    public void setYourCurrency(String yourCurrency) {
        this.yourCurrency = yourCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public boolean isBuyOrSell() {
        return buyOrSell;
    }

    public void setBuyOrSell(boolean buyOrSell) {
        this.buyOrSell = buyOrSell;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
