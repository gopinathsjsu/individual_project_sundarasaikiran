package com.kiran;

import java.util.List;

import com.kiran.creditcard.CreditCard;
import com.kiran.inputoutput.InputOutput;
import com.kiran.inputoutput.InputOutputFactory;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Invalid syntax. Usage: java Main <input filename> <output filename>");
            System.exit(1);
        }

        String inputFilename = args[0];
        String outputFilename = args[1];
        Utils.validatePaths(inputFilename, outputFilename);
        InputOutput io = new InputOutputFactory().getRecordIO(inputFilename);
        List<CreditCard> creditCards = io.readFile(inputFilename);
        boolean writeSuccess = io.writeFile(outputFilename, creditCards);
        if (writeSuccess) {
            System.out.println("Output successfully written to " + outputFilename);
        } else {
            System.out.println("Failed to write output");
        }
    }
}