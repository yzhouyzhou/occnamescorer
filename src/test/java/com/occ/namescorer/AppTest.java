package com.occ.namescorer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.occ.factory.NameScorer;
import com.occ.service.impl.NameListReader;
import com.occ.service.impl.NameScoreCalculator;

class AppTest {
	@Mock
	private NameListReader reader = new NameListReader();

	@Mock
	private NameScoreCalculator scoreCalc = new NameScoreCalculator();	

	@Test
	void testScoreNames() throws IOException {
		URL url = new URL("file:" + new File("./src/resources/names.txt"));	
		NameScorer scorer = new NameScorer(reader, scoreCalc);
		assertEquals(871198282, scorer.calculateListScore(url));	
	}
}
