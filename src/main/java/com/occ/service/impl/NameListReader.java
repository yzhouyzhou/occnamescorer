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
 *  Implementation from a given URL as a text file 
 *  split delimiter is ","
 */
public class NameListReader implements ListReader 
{
	public List<String> readList(URL p_listSource) throws IOException {		
		String nameStr = IOUtils.toString(p_listSource, Charset.defaultCharset());
        List<String> names = Arrays
        						.stream(nameStr.split(","))
        						.map(s -> s.substring(1, s.length()-1))        						
        						.collect(Collectors.toList());
        
        return names;
	}
}
