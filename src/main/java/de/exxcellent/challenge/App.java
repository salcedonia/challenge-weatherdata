package de.exxcellent.challenge;

import java.util.ArrayList;

import de.exxcellent.challenge.io.CSVReader;
import de.exxcellent.challenge.logic.WeatherAnalyzer;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    public static void main(String... args) {

    	CSVReader reader = new CSVReader("src\\main\\resources\\de\\exxcellent\\challenge\\weather.csv");
    	ArrayList<ArrayList<String>> data = reader.readCSV();
    	if (data != null)
    	{
    		WeatherAnalyzer analyzer = new WeatherAnalyzer(data);
            String dayWithSmallestTempSpread = analyzer.getdayWithSmallestTempSpread();//"Someday";     // Your day analysis function call …
            System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
            
            String teamWithSmallesGoalSpread = "A good team"; // Your goal analysis function call …
            System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallesGoalSpread);    		
    	}
    }
}
