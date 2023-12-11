package com.kiran.creditcard;

import org.junit.Test;

import com.kiran.creditcard.AmExCC;
import com.kiran.creditcard.CreditCard;
import com.kiran.creditcard.CreditCardFactory;
import com.kiran.creditcard.DiscoverCC;
import com.kiran.creditcard.MasterCC;
import com.kiran.creditcard.VisaCC;

import static org.junit.Assert.*;

public class CreditCardFactoryTest {

    @Test
    public void test_DiscoverCard() {
        CreditCardFactory f = new CreditCardFactory();
        CreditCard card = f.getCreditCard("6011111100007756");
        assertTrue(card instanceof DiscoverCC);
        assertEquals("Discover", card.toString());
    }

    @Test
    public void test_VisaCC() {
        CreditCardFactory f = new CreditCardFactory();
        CreditCard card = f.getCreditCard("4123456789123");
        assertTrue(card instanceof VisaCC);
        assertEquals("Visa", card.toString());
    }

    @Test
    public void test_AmExCC() {
        CreditCardFactory f = new CreditCardFactory();
        CreditCard card = f.getCreditCard("347856341908126");
        assertTrue(card instanceof AmExCC);
        assertEquals("AmericanExpress", card.toString());
    }

    @Test
    public void test_MasterCC() {
        CreditCardFactory f = new CreditCardFactory();
        CreditCard card = f.getCreditCard("5367894523129089");
        assertTrue(card instanceof MasterCC);
        assertEquals("MasterCard", card.toString());

    }

    @Test
    public void test_invalidCreditCardNumber() {
        CreditCardFactory f = new CreditCardFactory();
        assertThrows(UnsupportedOperationException.class, () -> f.getCreditCard("000"));
    }

}
