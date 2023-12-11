package com.kiran.creditcard;

public class VisaCC extends CreditCard {

    @Override
    public String toString() {
        return "Visa";
    }

    public static boolean isValidCard(String card) {
        return card.length() == 13 ||
                card.length() == 16 &&
                        card.charAt(0) == '4';
    }
}
