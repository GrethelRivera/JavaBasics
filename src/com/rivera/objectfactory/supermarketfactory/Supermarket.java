package com.rivera.objectfactory.supermarketfactory;

public class Supermarket {

    //listed filed declared
    // Constructor, getter & setter, toString

    private String dairy;
    private String vegetables;
    private short totalItems;
    private boolean bill;

    public Supermarket(String dairy, String vegetables, short totalItems) {
        this.dairy = dairy;
        this.vegetables = vegetables;
        this.totalItems = totalItems;
        this.bill = bill;
    }

    public String dairy() {
        return dairy;
    }

    public void setDairy(String dairy) {
        this.dairy = dairy;
    }

    public String vegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public short totalItems() {
        return totalItems;
    }

    public void setTotalItems(short totalItems) {
        this.totalItems = totalItems;
    }

    public boolean bill() {
        return bill;
    }

    public void setBill(boolean bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Supermarket{");
        sb.append("dairy='").append(dairy).append('\'');
        sb.append(", vegetables='").append(vegetables).append('\'');
        sb.append(", totalItems=").append(totalItems);
        sb.append(", bill=").append(bill);
        sb.append('}');
        return sb.toString();
    }
}
