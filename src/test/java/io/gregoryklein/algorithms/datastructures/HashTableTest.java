package io.gregoryklein.algorithms.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Gregory.KLEIN
 *
 */
public class HashTableTest {
	
	HashTable<String> hTable;
	
	@Before
	public void init() {
		hTable = new HashTable<String>(16);
	}

	@Test
	public void putAndGet() {
		hTable.put("key1", "value1");
		hTable.put("key2", "value2");
		hTable.put("key3", "value3");
		
		assertEquals(3, hTable.size());
	}
	
	@Test
	public void get() {
		hTable.put("key1", "value1");
		hTable.put("key2", "value2");
		hTable.put("key3", "value3");
		
		String val1 = hTable.get("key1");
		assertEquals("value1", val1);
		
		String val3 = hTable.get("key3");
		assertEquals("value3", val3);
	}
	
	@Test
	public void size() {
		hTable.put("key1", "value1");
		hTable.put("key2", "value2");
		
		assertEquals(2, hTable.size());
		
		hTable.put("key3", "value3");
		
		assertEquals(3, hTable.size());
	}

}
