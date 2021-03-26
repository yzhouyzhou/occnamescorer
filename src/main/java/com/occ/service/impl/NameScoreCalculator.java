package com.occ.service.impl;

import com.occ.service.api.ScoreCalculator;

/**
 * 
 * @author Ying Zhou
 *
 * Calculate a string score based on letter-only from A to Z
 * 'A'=1,'B'=2, etc
 * index multiplied by the sum of the name's letter.
 */
public class NameScoreCalculator implements ScoreCalculator
{
	public int calculateScore(int p_nameIndex, String p_name) throws IllegalArgumentException {
		return p_nameIndex * nameSum(p_name);
	}

	protected int nameSum(String p_name) throws IllegalArgumentException {
		// only consider the first word of the trimmed name
		if(p_name == null) {
			return 0;
		}
		return p_name.toUpperCase().chars()
				.parallel()
				.filter(c->(c>=(int)'A' && c<=(int)'Z'))
				.map(c->c-(int)'A'+1)
				.sum();
	}
}
