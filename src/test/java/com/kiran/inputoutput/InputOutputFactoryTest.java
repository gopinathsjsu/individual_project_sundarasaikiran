package com.kiran.inputoutput;

import org.junit.Test;

import com.kiran.inputoutput.CsvInputOutput;
import com.kiran.inputoutput.InputOutputFactory;
import com.kiran.inputoutput.JsonInputOutput;
import com.kiran.inputoutput.XmlInputOutput;

import static org.junit.Assert.assertThrows;

public class InputOutputFactoryTest {

    @Test
    public void test_CSV() {
        InputOutputFactory f = new InputOutputFactory();
        assert (f.getRecordIO("file.csv") instanceof CsvInputOutput);
    }

    @Test
    public void test_XML() {
        InputOutputFactory f = new InputOutputFactory();
        assert (f.getRecordIO("file.xml") instanceof XmlInputOutput);
    }

    @Test
    public void test_JSON() {
        InputOutputFactory f = new InputOutputFactory();
        assert (f.getRecordIO("file.json") instanceof JsonInputOutput);
    }

    @Test
    public void test_unsupported() {
        InputOutputFactory f = new InputOutputFactory();
        assertThrows(UnsupportedOperationException.class, () -> f.getRecordIO("file.proto"));
    }

}

