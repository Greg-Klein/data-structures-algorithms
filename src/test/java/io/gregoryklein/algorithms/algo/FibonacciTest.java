package io.gregoryklein.algorithms.algo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
	
	FibonacciNaive naive;
	FibonacciMemoized memoized;
	
	@Before
	public void init() {
		naive = new FibonacciNaive();
		memoized = new FibonacciMemoized();
	}

	@Test
	public void testNaive() {
		assertEquals(0, naive.fib(0));
		assertEquals(1, naive.fib(1));
		assertEquals(1, naive.fib(2));
		assertEquals(2, naive.fib(3));
		assertEquals(3, naive.fib(4));
		assertEquals(5, naive.fib(5));
		assertEquals(8, naive.fib(6));
		assertEquals(13, naive.fib(7));
		assertNotEquals(0, naive.fib(30));
	}
	
	@Test
	public void testMemoized() {
		assertEquals(0, naive.fib(0));
		assertEquals(1, naive.fib(1));
		assertEquals(1, naive.fib(2));
		assertEquals(2, naive.fib(3));
		assertEquals(3, naive.fib(4));
		assertEquals(5, naive.fib(5));
		assertEquals(8, naive.fib(6));
		assertEquals(13, naive.fib(7));
		assertNotEquals(0, naive.fib(10));
	}

}
