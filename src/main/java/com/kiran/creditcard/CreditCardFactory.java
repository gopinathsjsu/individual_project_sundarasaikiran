package com.kiran.creditcard;

public class CreditCardFactory {
    public CreditCard getCreditCard(String cardNumber) {
        if(cardNumber.contains("*") || cardNumber.contains("$") || cardNumber.contains("!") || cardNumber.contains("@") || cardNumber.contains("#") || cardNumber.contains("%") || cardNumber.contains("&") || cardNumber.contains(",") || cardNumber.contains(".")) {
            throw new UnsupportedOperationException("Invalid: non numeric characters");
        } else if(cardNumber.length() > 19) {
            throw new UnsupportedOperationException("Invalid: more than 19 digits");
        } else if(cardNumber.isEmpty()) {
            throw new UnsupportedOperationException("Invalid: empty/null card number");
        } else if (MasterCC.isValidCard(cardNumber)) {
            return new MasterCC();
        } else if (VisaCC.isValidCard(cardNumber)) {
            return new VisaCC();
        } else if (AmExCC.isValidCard(cardNumber)) {
            return new AmExCC();
        } else if (DiscoverCC.isValidCard(cardNumber)) {
            return new DiscoverCC();
        } else {
            throw new UnsupportedOperationException("Invalid: not a possible card number");
        }
    }
}