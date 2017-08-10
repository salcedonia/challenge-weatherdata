package de.exxcellent.challenge;

import org.junit.Assert;
import org.junit.Test;

import de.exxcellent.challenge.logic.WeatherAnalyzer;

/**
 * JUnit4 test case for WeatherAnalyzer class.
 * @author salcedonia
 */
public class WeatherAnalyzerTest {

	@Test
    public void getSmallestSpreadTest() {
		WeatherAnalyzer analyzer = new WeatherAnalyzer();
        Assert.assertEquals(analyzer.getSmallestSpread(), "14");
    }
}
