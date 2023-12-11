package com.kiran.inputoutput;

import org.junit.Test;

import com.kiran.creditcard.CreditCard;
import com.kiran.inputoutput.InputOutput;
import com.kiran.inputoutput.InputOutputFactory;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class IOTest {

    @Test
    public void test_readFromCsv() {
        String filePath = "src/main/resources/input.csv";
        InputOutput recordIO = new InputOutputFactory().getRecordIO(filePath);
        List<CreditCard> data = recordIO.readFile(filePath);
        CreditCard r = data.get(0);
        assertEquals("5567894523129089", r.getCardNumber());
        assertEquals("08/26", r.getExpirationDate());
        assertEquals("John DoE", r.getNameOfHolder());
    }

    @Test
    public void test_readFromXml() {
        String filePath = "src/main/resources/input.xml";
        InputOutput recordIO = new InputOutputFactory().getRecordIO(filePath);
        List<CreditCard> records = recordIO.readFile(filePath);
        CreditCard r = records.get(0);
        assertEquals("5567894523129089", r.getCardNumber());
        assertEquals("08/26", r.getExpirationDate());
        assertEquals("John DoE", r.getNameOfHolder());
    }

    @Test
    public void test_readFromJson() {
        String filePath = "src/main/resources/input.json";
        InputOutput recordIO = new InputOutputFactory().getRecordIO(filePath);
        List<CreditCard> records = recordIO.readFile(filePath);
        CreditCard r = records.get(0);
        assertEquals("5567894523129089", r.getCardNumber());
        assertEquals("08/26", r.getExpirationDate());
        assertEquals("John DoE", r.getNameOfHolder());
    }
}
