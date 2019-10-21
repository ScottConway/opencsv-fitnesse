package com.opencsv.fitnesse;

import fit.ColumnFixture;
import java.io.IOException;
import java.util.Arrays;

public class CsvParserTester extends ColumnFixture {
    public String data;

    public int numberOfFields() throws IOException {
       return CsvParserSetupFixture.getParser().parseLine(data).length;
    }

    public String parsedFields() throws IOException {
        String[] fields = CsvParserSetupFixture.getParser().parseLine(data);
        return Arrays.toString(fields);
    }
}
