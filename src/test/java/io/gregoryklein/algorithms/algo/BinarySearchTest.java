package io.gregoryklein.algorithms.algo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {
	
	BinarySearch binarySearch;
	int[] array = new int[]{1, 5, 11, 32, 45, 60, 89, 104};
	
	@Before
	public void init() {
		binarySearch = new BinarySearch();
	}

	@Test
	public void test() {
		int result = binarySearch.search(new int[]{}, 3);
		assertEquals(-1, result);
		
		result = binarySearch.search(array, 3);
		assertEquals(-1, result);
		
		result = binarySearch.search(array, 89);
		assertEquals(6, result);
		
		result = binarySearch.search(array, 11);
		assertEquals(2, result);
	}

}
