package de.exxcellent.challenge.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {
	
	/**
	 * Stores the name of the csv file to be read
	 */
	private String _csvFileName;

	/**
	 * Constructor.
	 * @param csvFileName Name of the cvs file to be read
	 */
	public CSVReader(String csvFileName)
	{
		_csvFileName = csvFileName;
	}
	
	/**
	 * Reads the csv file stored within the _csvFileName
	 * @return The corresponding structured to be used for further 
	 * analysis.
	 */
	public ArrayList<ArrayList<String>> readCSV()
	{
		BufferedReader bufferReader = null;
    	ArrayList<ArrayList<String>> csvLines = new ArrayList<ArrayList<String>>();
    	
		try {
			String fileLine;
			bufferReader = new BufferedReader(new FileReader(_csvFileName));
			bufferReader.readLine(); // Skips header line
			
			while ((fileLine = bufferReader.readLine()) != null) {
				System.out.println("Raw CSV data: " + fileLine);
				csvLines.add(csvToArrayList(fileLine));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferReader != null) {
					bufferReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return csvLines;
	}
	
    /**
     * Converts CSV to ArrayList using Split Operation
     * @param csvFile file contents to be converted
     * @return The resulting ArrayList object
     */
 	public static ArrayList<String> csvToArrayList(String csvFile) {
 		ArrayList<String> list = new ArrayList<String>();
 		
 		if (csvFile != null) {
 			String[] splitData = csvFile.split("\\s*,\\s*");
 			for (int i = 0; i < splitData.length; i++) {
 				if (!(splitData[i] == null) || !(splitData[i].length() == 0)) {
 					list.add(splitData[i].trim());
 				}
 			}
 		}
 		
 		// Removes unnecessary columns
 		for (int i = 3; i < list.size(); i++) {
 			list.remove(i);
 		}
 		return list;
 	}
}
