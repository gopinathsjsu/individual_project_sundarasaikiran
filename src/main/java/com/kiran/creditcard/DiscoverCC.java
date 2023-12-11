package com.kiran.creditcard;

public class DiscoverCC extends CreditCard {

    @Override
    public String toString() {
        return "Discover";
    }

    public static boolean isValidCard(String card) {
        return card.length() == 16 &&
                card.startsWith("6011");
    }
}
