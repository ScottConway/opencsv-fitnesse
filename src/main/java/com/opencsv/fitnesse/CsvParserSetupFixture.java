package com.opencsv.fitnesse;

import com.opencsv.ICSVParser;
import fitlibrary.SetUpFixture;

public class CsvParserSetupFixture extends SetUpFixture {
    private ICSVParser parserList;

    public CsvParserSetupFixture() {
    }

    public void separatorQuoteEscapeStrictQuotesIgnoreLeadingWhiteSpaceIgnoreQuotationsNullFieldIndicator(char separator,
                                                                                                          char quote, char escape,
                                                                                                          boolean strictQuotes,
                                                                                                          boolean ignoreLeadingWhiteSpace,
                                                                                                          boolean ignoreQuotations,
                                                                                                          String nullFieldIndicator) {
    System.out.println("Hello world");
    }
}
