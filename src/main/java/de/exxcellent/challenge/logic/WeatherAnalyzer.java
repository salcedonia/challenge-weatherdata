package de.exxcellent.challenge.logic;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Analyzes the data corresponding to temperatures in a given month
 * of the year and computes the day with the smallest temperature 
 * spread (difference between maximum & minimum temperature of the day.)  
 * @author salcedonia
 * @see DataAnalyzer
 */
public class WeatherAnalyzer extends DataAnalyzer {
	
	/**
	 * Path to the file containing the data to be loaded for the
	 * weather challenge.
	 */
	private static final String CSV_FILE = "src\\main\\resources\\de\\exxcellent\\challenge\\weather.csv";
	
	/**
	 * Constructor.
	 */
	public WeatherAnalyzer()
	{
		_sourceFile = CSV_FILE;
		_columnsToBeKept = new ArrayList<Integer>(Arrays.asList(0, 1, 2));
		readData();
	}

	@Override
	public void printAnalysisResult() {
		System.out.printf("Day with smallest temperature spread : %s%n", getSmallestSpread());
	}
}
