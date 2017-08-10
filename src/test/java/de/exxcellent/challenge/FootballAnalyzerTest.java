package de.exxcellent.challenge;

import org.junit.Assert;
import org.junit.Test;

import de.exxcellent.challenge.logic.FootballAnalyzer;

/**
 * JUnit4 test case for FootballAnalyzer class.
 * @author salcedonia
 */
public class FootballAnalyzerTest {

	@Test
    public void getSmallestSpreadTest() {
		FootballAnalyzer analyzer = new FootballAnalyzer();
        Assert.assertEquals(analyzer.getSmallestSpread(), "Blackburn");
    }
}
