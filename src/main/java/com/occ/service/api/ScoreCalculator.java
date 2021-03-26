package com.occ.service.api;


/**
 *  @author Ying Zhou
 *  
 *  The algorithm to calculate
 *  
 */
public interface ScoreCalculator {
	/**
	 * Calculate a name's score based on it's index and name.
	 * 
	 * @param p_Index the name position
	 * @param p_name the name to be calculated
	 * @throws IllegalArgumentException thrown if p_name cannot be processed
	 * @return the score
	 */
	public int calculateScore(int p_Index, String p_name) throws IllegalArgumentException;
}
