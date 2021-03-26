package com.occ.service.impl;


import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.IOUtils;

import com.occ.service.api.ListReader;


/**
 *  @author Ying Zhou
 *  
 *  Simple list reader implementation that processes a given URL as a simple text file and
 *  returns a list of all non-empty trimmed lines of content.
 *  <p>
 *  Note that a local text file can be specified via the "file:" URL prefix  
 */
public class NameListReader implements ListReader 
{
	public List<String> readList(URL p_src) throws IOException {		
		String nameStr = IOUtils.toString(p_src, Charset.defaultCharset());
        List<String> names = Arrays
        						.stream(nameStr.split(","))
        						.map(s -> s.substring(1, s.length()-1))        						
        						.collect(Collectors.toList());
        
        return names;
	}
}
