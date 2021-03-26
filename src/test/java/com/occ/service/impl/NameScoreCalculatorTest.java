package com.occ.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Ying Zhou
 *
 */
public class NameScoreCalculatorTest {
	private NameScoreCalculator calc = new NameScoreCalculator();	

	@Test
	public void testCalculateScore() {
		int position = 11;
		String name = "Ying";
		assertEquals(605, calc.calculateScore(position, name));
	}

	@Test
	public void testNameSum() {
		String name = "ying";		
		assertEquals(55, calc.nameSum(name));
	}
}
