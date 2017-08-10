package de.exxcellent.challenge.logic;

import java.util.ArrayList;

/**
 * Analyzes the data corresponding to temperatures in a given month
 * of the year and computes the day with the smallest temperature 
 * spread (difference between maximum & minimum temperature of the day.)  
 * @author salcedonia
 */
public class WeatherAnalyzer {

	/**
	 * Data to be analyzed.
	 */
	private ArrayList<ArrayList<String>> _data;
	
	/**
	 * Constructor.
	 * @param data Data to be analyzed.
	 */
	public WeatherAnalyzer(ArrayList<ArrayList<String>> data)
	{
		setData(data);
	}
	
	/**
	 * Returns the day with the smallest temperature spread on the month.
	 * @return The day with the smallest temperature spread on the month.
	 */
	public String getdayWithSmallestTempSpread()
	{
		String day = "";
		int smallestSpread = -1;
		for (ArrayList<String> line : _data) {
			int maxTemp = Integer.parseInt(line.get(1));
			int minTemp = Integer.parseInt(line.get(2));
			int diff = maxTemp - minTemp;
			if (smallestSpread == -1) { // If not yet initialized
				smallestSpread = diff;
			}
			if (diff < smallestSpread) {
				smallestSpread = diff;
				day = line.get(0);
			}
		}
		return day;
	}

	/**
	 * Returns the data to be analyzed.
	 * @return The data to be analyzed.
	 */
	public ArrayList<ArrayList<String>> getData() {
		return _data;
	}

	/**
	 * Sets new data to be analyzed.
	 * @param _data New data to be analyzed.
	 */
	public void setData(ArrayList<ArrayList<String>> _data) {
		this._data = _data;
	}
}
