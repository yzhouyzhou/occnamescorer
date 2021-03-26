package com.occ.factory;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.occ.service.api.ListReader;
import com.occ.service.api.ScoreCalculator;

/**
 *  @author Ying Zhou
 *  
 * This class calculates a summarized score for all names in a list. 
 */
public class NameScorer implements FactoryScorer{
	private ListReader reader;
	private ScoreCalculator scoreCalculator;

	public NameScorer(ListReader p_reader, ScoreCalculator p_scoreCalc) {
		this.reader = p_reader;
		this.scoreCalculator = p_scoreCalc;
	}

	public int calculateListScore(URL p_listSource) throws IOException {
		// sortedList contains all the names with alphabetical order sorted
		List<String> sortedList = reader.readList(p_listSource)
										.stream()
										.sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
										.collect(Collectors.toList());												

		// index of position * score of each name, and calculate the total
		return IntStream.range(0, sortedList.size())
				.parallel()
				.map(idx -> {
						return scoreCalculator.calculateScore(idx + 1, sortedList.get(idx));
					})
				.reduce(0, (a, b) -> a + b);
	}
}
