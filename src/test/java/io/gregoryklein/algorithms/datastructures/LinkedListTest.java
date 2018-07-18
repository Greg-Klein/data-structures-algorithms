package io.gregoryklein.algorithms.datastructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import io.gregoryklein.algorithms.datastructures.LinkedList;

public class LinkedListTest {
	
	LinkedList<String> list;
	
	@Before
	public void init() {
		list = new LinkedList<String>();
	}

	@Test
	public void shouldAdd() {
		list.addLast("a");
		list.addLast("b");
		list.addLast("c");
		assertEquals(3, list.size());
	}
	
	@Test
	public void shouldGetFirst() {
		list.addLast("a");
		list.addLast("b");
		list.addLast("c");
		String aux = (String) list.getFirst();
		assertEquals("a", aux);
	}
	
	@Test
	public void shouldGetLast() {
		list.addLast("a");
		list.addLast("b");
		list.addLast("c");
		String aux = (String) list.getLast();
		assertEquals("c", aux);
	}

}
