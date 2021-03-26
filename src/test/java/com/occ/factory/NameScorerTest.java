package com.occ.factory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.occ.service.impl.NameListReader;
import com.occ.service.impl.NameScoreCalculator;
/**
 * @author Ying Zhou
 *
 */
class NameScorerTest {
	@Mock
	private NameListReader reader = new NameListReader();

	@Mock
	private NameScoreCalculator scoreCalc = new NameScoreCalculator();	
	
	@Test
	public void testCalculateListScore() throws IOException {
		URL url = new URL("file:" + new File("./src/resources/samples.txt"));	
		NameScorer scorer = new NameScorer(reader, scoreCalc);
		assertEquals(3194, scorer.calculateListScore(url));	
	}

}
