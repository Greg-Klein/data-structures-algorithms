package io.gregoryklein.algorithms.algo.fibonacci;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import io.gregoryklein.algorithms.algo.fibonacci.FibonacciMemoized;
import io.gregoryklein.algorithms.algo.fibonacci.FibonacciNaive;

public class FibonacciTest {

	@Test
	public void testNaive() {
		FibonacciNaive naive = new FibonacciNaive();
		
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
		FibonacciMemoized memoized = new FibonacciMemoized();
		
		assertEquals(0, memoized.fib(0));
		assertEquals(1, memoized.fib(1));
		assertEquals(1, memoized.fib(2));
		assertEquals(2, memoized.fib(3));
		assertEquals(3, memoized.fib(4));
		assertEquals(5, memoized.fib(5));
		assertEquals(8, memoized.fib(6));
		assertEquals(13, memoized.fib(7));
		assertNotEquals(0, memoized.fib(10));
	}

}
