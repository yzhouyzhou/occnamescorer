package com.occ.service.api;


/**
 *  @author Ying Zhou
 *  
 *  Implementations of this interface provide the algorithm to calculate
 *  the individual score of a string.
 */
public interface ScoreCalculator {
	/**
	 * Calculate a name's score based on it's index and name.
	 * 
	 * @param p_nameIndex the index of the name in some external list
	 * @param p_name the name for whom the score is to be calculated
	 * @throws IllegalArgumentException thrown if the contents of p_name cannot be processed
	 * @return the integer score derived from the parameters
	 */
	public int calculateScore(int p_nameIndex, String p_name) throws IllegalArgumentException;
}
