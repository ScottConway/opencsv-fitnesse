package com.opencsv.fitnesse;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.ICSVParser;
import com.opencsv.enums.CSVReaderNullFieldIndicator;
import fitlibrary.SetUpFixture;

public class CsvParserSetupFixture extends SetUpFixture {
    private static CSVParser parser;

    public CsvParserSetupFixture() {
    }

    public void separatorQuoteEscapeStrictQuotesIgnoreLeadingWhiteSpaceIgnoreQuotationsNullFieldIndicator(
        char separator,
        char quote, char escape,
        boolean strictQuotes,
        boolean ignoreLeadingWhiteSpace,
        boolean ignoreQuotations,
        String nullFieldIndicator) {
        System.out.println("Hello world");
        CSVParserBuilder builder = new CSVParserBuilder()
            .withSeparator(separator)
            .withQuoteChar(quote)
            .withEscapeChar(escape)
            .withStrictQuotes(strictQuotes)
            .withIgnoreLeadingWhiteSpace(ignoreLeadingWhiteSpace)
            .withIgnoreQuotations(ignoreQuotations)
            .withFieldAsNull(determineNullFieldIndicator(nullFieldIndicator));
        parser = builder.build();
    }

    public void separatorQuoteEscapeStrictQuotesIgnoreLeadingWhiteSpaceIgnoreQuotations(
        char separator,
        char quote, char escape,
        boolean strictQuotes,
        boolean ignoreLeadingWhiteSpace,
        boolean ignoreQuotations) {
        System.out.println("Howdy world");
        CSVParserBuilder builder = new CSVParserBuilder()
            .withSeparator(separator)
            .withQuoteChar(quote)
            .withEscapeChar(escape)
            .withStrictQuotes(strictQuotes)
            .withIgnoreLeadingWhiteSpace(ignoreLeadingWhiteSpace)
            .withIgnoreQuotations(ignoreQuotations);
        parser = builder.build();
    }

    private CSVReaderNullFieldIndicator determineNullFieldIndicator(String indicator) {
        if ("EMPTY_SEPARATORS".equalsIgnoreCase(indicator)) {
            return CSVReaderNullFieldIndicator.EMPTY_SEPARATORS;
        } else if ("EMPTY_QUOTES".equalsIgnoreCase(indicator)) {
            return CSVReaderNullFieldIndicator.EMPTY_QUOTES;
        } else if ("BOTH".equalsIgnoreCase(indicator)) {
            return CSVReaderNullFieldIndicator.BOTH;
        } else {
            return CSVReaderNullFieldIndicator.NEITHER;
        }
    }

    public static CSVParser getParser() {
        return parser;
    }
}
