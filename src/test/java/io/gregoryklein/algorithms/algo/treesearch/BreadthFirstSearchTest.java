package io.gregoryklein.algorithms.algo.treesearch;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import io.gregoryklein.algorithms.algo.treesearch.BreadthFirstSearch;
import io.gregoryklein.algorithms.model.Vertex;

/**
 * @author gregory.klein
 *
 */
public class BreadthFirstSearchTest {
	
	BreadthFirstSearch search;
	
	/**
	 * 		S
	 * 	  / | \
	 * 	 A  B  C
	 * 	  \ | /
	 * 		D
	 * 		|
	 * 		E
	 */
	
	@Before
	public void init() {
		search = new BreadthFirstSearch();

		search.setMax(6);
		
		search.addVertex("S");   // 0
		search.addVertex("A");   // 1
		search.addVertex("B");   // 2
		search.addVertex("C");   // 3
		search.addVertex("D");   // 4
		search.addVertex("E");   // 5

		search.addEdge(0, 1);    // S - A
		search.addEdge(0, 2);    // S - B
		search.addEdge(0, 3);    // S - C
		search.addEdge(1, 4);    // A - D
		search.addEdge(2, 4);    // B - D
		search.addEdge(3, 4);    // C - D
		search.addEdge(4, 5);    // S - E
	}

	@Test
	public void test() throws InterruptedException {
		List<Vertex> result = search.breadthFirstsearch();
		
		assertEquals(6, result.size());
		
		List<String> order = Arrays.asList("S", "A", "B", "C", "D", "E");
		
		for (int i = 0; i < result.size(); i++)
			assertEquals(order.get(i), result.get(i).getLabel());
	}

}
