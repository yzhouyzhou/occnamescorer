package com.occ.factory;

import java.io.IOException;
import java.net.URL;

/**
 *  @author Ying Zhou
 *  
 *  Implementations of this interface
 *  Loading data with given resource
 *  Calculate the totalScore with proper algorithms
 */
public interface FactoryScorer {
	/**
	 * Input file resource
	 * @param p_listSource file resource
	 * @return the total score
	 * @throws IOException thrown if there is an I/O error loading data.
	 */
	
	public int calculateListScore(URL p_listSource) throws IOException;

}
