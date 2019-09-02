package io.gregoryklein.algorithms.algo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Gregory.KLEIN
 *
 */
public class BinarySearchTest {

	@Test
	public void testBinarySearch() {
		int index = BinarySearch.search(new int[]{3, 11, 21, 29, 41, 54, 61, 78, 110, 127}, 78);
		assertEquals(7, index);
		
		index = BinarySearch.search(new int[]{3, 11, 21, 29, 41, 54, 61, 78, 110, 127}, 8);
		assertEquals(-1, index);
		
		index = BinarySearch.search(new int[]{3, 11, 21, 29, 41, 54, 61, 78, 110, 127}, 21);
		assertEquals(2, index);
	}

}
