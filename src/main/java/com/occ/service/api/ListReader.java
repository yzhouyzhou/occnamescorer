package com.occ.service.api;


import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 *  @author Ying Zhou
 *  
 *  Implementations of this interface to load data resource.
 */
public interface ListReader 
{
	/**
	 * Input file resource
	 * @param p_listSource file resource
	 * @return the total score
	 * @throws IOException thrown if there is an I/O error loading data.
	 */
	public List<String> readList(URL p_listSource) throws IOException;
}
