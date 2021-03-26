package com.occ.service.api;


import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 *  @author Ying Zhou
 *  
 *  Implementations of this interface provide the mechanism to process a document
 *  specified by the given source to a list of strings.
 */
public interface ListReader 
{
	/**
	 * Open the specified source and return its contents as a list of String 
	 * @param p_src identifies the document source
	 * @return the per-line contents of the source document
	 * @throws IOException thrown if there is an I/O error related to reading p_src.
	 */
	public List<String> readList(URL p_src) throws IOException;
}
