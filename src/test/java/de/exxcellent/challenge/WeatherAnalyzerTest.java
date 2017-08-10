package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import de.exxcellent.challenge.logic.WeatherAnalyzer;

/**
 * JUnit4 test case for WeatherAnalyzer class.
 * @author salcedonia
 */
public class WeatherAnalyzerTest {

	@Test
    public void getdayWithSmallestTempSpreadTest() {
		
		ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> line1 = new ArrayList<>(Arrays.asList("1", "30", "15"));
		data.add(line1);
		
		ArrayList<String> line2 = new ArrayList<>(Arrays.asList("2", "30", "24"));
		data.add(line2);
		
		ArrayList<String> line3 = new ArrayList<>(Arrays.asList("3", "30", "29"));
		data.add(line3);
		
		WeatherAnalyzer analyzer = new WeatherAnalyzer(data);
        Assert.assertEquals(analyzer.getdayWithSmallestTempSpread(), "3");
    }
}
