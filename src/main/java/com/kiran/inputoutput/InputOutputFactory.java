package com.kiran.inputoutput;

public class InputOutputFactory {
    public InputOutput getRecordIO(String filename) {
        if (filename.endsWith(".csv")) {
            return new CsvInputOutput();
        } else if (filename.endsWith(".json")) {
            return new JsonInputOutput();
        } else if (filename.endsWith(".xml")) {
            return new XmlInputOutput();
        } else {
            throw new UnsupportedOperationException();
        }
    }
}