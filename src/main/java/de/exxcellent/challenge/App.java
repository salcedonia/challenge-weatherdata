package de.exxcellent.challenge;

import de.exxcellent.challenge.logic.DataAnalyzer;
import de.exxcellent.challenge.logic.FootballAnalyzer;
import de.exxcellent.challenge.logic.WeatherAnalyzer;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

	/**
	 * Name of the command line argument to trigger the <b>weather</b> challenge.
	 */
	public static final String WEATHER_CHALLENGE = "weather";
	/**
	 * Name of the command line argument to trigger the <b>footbal</b> challenge.
	 */
	public static final String FOOTBALL_CHALLENGE = "football";
	
	/**
	 * Entry point of the application.
	 * @param args Arguments passed from the command line.
	 */
    public static void main(String... args) {

    	if (args.length != 1 || (!args[0].equals(WEATHER_CHALLENGE) && !args[0].equals(FOOTBALL_CHALLENGE))) {
    		System.err.printf("Wrong parameters: use either " + WEATHER_CHALLENGE + " or " + FOOTBALL_CHALLENGE);
    		return;
        }
    	
    	DataAnalyzer analyzer = null;
    	if (args[0].equals(WEATHER_CHALLENGE)) {
    		analyzer = new WeatherAnalyzer();
    	}
    	else if (args[0].equals(FOOTBALL_CHALLENGE)) {
    		analyzer = new FootballAnalyzer();
		}
    	analyzer.printAnalysisResult();
    }
}
