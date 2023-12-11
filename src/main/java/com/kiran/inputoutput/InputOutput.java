package com.kiran.inputoutput;

import java.util.List;

import com.kiran.creditcard.CreditCard;

public interface InputOutput {
    List<CreditCard> readFile(String filename);

    boolean writeFile(String filename, List<CreditCard> records);
}