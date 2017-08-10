package de.exxcellent.challenge.logic;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Analyzes the data corresponding to results of the English Premier League
 * and computes the name of the team with the smallest difference in ‘Goals’ and ‘Goals Allowed’. 
 * @author salcedonia
 * @see DataAnalyzer
 */
public class FootballAnalyzer extends DataAnalyzer {

	/**
	 * Path to the file containing the data to be loaded for the
	 * weather challenge.
	 */
	private static String CSV_FILE = "src\\main\\resources\\de\\exxcellent\\challenge\\football.csv";

	/**
	 * Constructor.
	 */
	public FootballAnalyzer()
	{
		_sourceFile = CSV_FILE;
		_columnsToBeKept = new ArrayList<Integer>(Arrays.asList(0, 5, 6));
		readData();
	}

	@Override
	public void printAnalysisResult() {
		System.out.printf("Team with smallest goal spread       : %s%n", getSmallestSpread());
	}
}
