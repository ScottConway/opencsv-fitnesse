# opencsv-fitnesse
Project to relearn fitnesse by creating tests for opencsv

To start perform a mvn clean install then in the fitnesse directory 
run the startFitnesse.sh script.   Fitnesse will then be running on port
10000 (http://localhost:10000/).

Then click on the CsvParserSuite and click the Suite at the top of the page
to run all the tests. 

You can also run tests individually inside IntelliJ with the Fitnesse plugin.  This is 
ideal when working on fixture code as you don't have to restart fitnesse for 
each change but if a test is failing it is sometime easier to start fitnesse
to look at the graphical green/red results than to look at the output code.   

