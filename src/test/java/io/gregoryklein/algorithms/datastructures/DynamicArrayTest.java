package io.gregoryklein.algorithms.datastructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DynamicArrayTest {
	
	DynamicArray<String> arr;
	
	@Before
	public void init() {
		arr = new DynamicArray<String>();
	}

	@Test
	public void testPush() {
		arr.push("a");
		arr.push("b");
		assertEquals(2, arr.size());
		assertEquals("[a, b]", arr.toString());
	}
	
	@Test
	public void testDoubleSize() {
		arr.push("a");
		arr.push("b");
		arr.push("c");
		arr.push("d");
		arr.push("e");
		arr.push("f");
		arr.push("g");
		arr.push("h");
		arr.push("i");
		arr.push("j");
		arr.push("k");
		assertEquals(11, arr.size());
		assertEquals("[a, b, c, d, e, f, g, h, i, j, k]", arr.toString());
	}
	
	@Test
	public void testPop() {
		arr.push("a");
		arr.push("b");
		String popped = arr.pop();
		assertEquals(1, arr.size());
		assertEquals("b", popped);
		assertEquals("[a]", arr.toString());
	}
	
	@Test
	public void testUnshift() {
		arr.unshift("a");
		arr.unshift("b");
		assertEquals(2, arr.size());
		assertEquals("[b, a]", arr.toString());
	}
	
	@Test
	public void testShift() {
		arr.push("a");
		arr.push("b");
		String firstElement = arr.shift();
		assertEquals(1, arr.size());
		assertEquals("a", firstElement);
		assertEquals("[b]", arr.toString());
	}

}
