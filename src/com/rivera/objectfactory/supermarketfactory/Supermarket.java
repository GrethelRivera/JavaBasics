package com.rivera.objectfactory.supermarketfactory;

public class Supermarket {

    //listed filed declared
    // Constructor, getter & setter, toString

    private String dairy;
    private String vegetables;
    private boolean checkout;



    public Supermarket(String dairy, String vegetables, boolean checkout) {
        this.dairy = dairy;
        this.vegetables = vegetables;
        this.checkout = checkout;

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

    public boolean bill() {
        return checkout;
    }

    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("Dairy Products: '").append(dairy).append('\'');
        sb.append("\nVegetables: '").append(vegetables).append('\'');
        sb.append("\nCheckout: ").append(checkout);
        //(condition)? (if true, do this) : Ternary Operator
        sb.append("\n Thank you for shopping with us.").append(checkout ? " you may go to aisle 3 for checkout": " Please continue your shopping.");


        return sb.toString();
    }
}
