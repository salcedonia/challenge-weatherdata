package de.exxcellent.challenge.logic;

import java.util.ArrayList;

import de.exxcellent.challenge.io.CSVReader;

/**
 * Analyzes the data coming from a csv file and provides the 
 * minimum spread among its data.
 * @author salcedonia
 */
public abstract class DataAnalyzer {

	/**
	 * Data to be analyzed.
	 */
	protected ArrayList<ArrayList<String>> _data;
	
	/**
	 * Name of the file containing the data to be read.
	 */
	protected String _sourceFile;
	
	/**
	 * Columns which are not pruned from the csv file.
	 */
	protected ArrayList<Integer> _columnsToBeKept;
	
	/**
	 * Reads the data from a source file;
	 */
	public void readData()
	{
		CSVReader reader = new CSVReader(_sourceFile, _columnsToBeKept);
    	_data = reader.readCSV();
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
	
	/**
	 * Returns the minimum spread among its data.
	 * @return The minimum spread among its data.	
	 */
	public String getSmallestSpread() {
		String returnValue = "";
		int smallestSpread = -1;
		for (ArrayList<String> line : _data) {
			int maxValue = Integer.parseInt(line.get(1));
			int minValue = Integer.parseInt(line.get(2));
			int diff = maxValue - minValue;
			if (smallestSpread == -1) { // If not yet initialized
				smallestSpread = diff;
			}
			if ((diff > 0) && (diff < smallestSpread)) {
				smallestSpread = diff;
				returnValue = line.get(0);
			}
		}
		return returnValue;
	}
	
	/**
	 * Print the result of the analysis.
	 */
	public abstract void printAnalysisResult();
}
