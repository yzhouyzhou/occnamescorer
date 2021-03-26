package com.occ.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.junit.jupiter.api.Test;

/**
 * @author Ying Zhou
 *
 */
public class NameListReaderTest {
	private NameListReader reader = new NameListReader();

	@Test
	public void testReadList() throws IOException {
		URL url = new URL("file:" + new File("./src/resources/samples.txt"));
		assertEquals(9, reader.readList(url).size());
	}
}
