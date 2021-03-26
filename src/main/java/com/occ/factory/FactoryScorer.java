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
	 * Open the specified source and calculate the totalScore 
	 * @param p_src identifies the document source
	 * @return the total score
	 * @throws IOException thrown if there is an I/O error related to reading p_src.
	 */
	
	public int calculateListScore(URL p_listSource) throws IOException;

}
