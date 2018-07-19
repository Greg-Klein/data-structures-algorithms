package io.gregoryklein.algorithms.datastructures;

public class LinkedList<T> {
	
	public class Node {
		T value;
		Node next;
		
		public Node(T data) {
			this.value = data;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(value.toString());
			if(next != null) {
				sb.append(",");
				sb.append(next.toString());
			}
			return sb.toString();
		}
		
		
	}
	
	private Node head;
	private int size = 0;
	
	
	@Override
	public String toString() {
		return "[" + head + "]";
	}
	
	private Node goToLast() {
		Node current = head;
		
		while(current.next != null) {
			current = current.next;
		}
		
		return current;
	}

	public void addFirst(T data) {
		Node node = new Node(data);
		size++;
		
		if(head != null) {
			node.next = head;
		}
		
		head = node;
	}

	public void addLast(T data) {
		
		Node node = new Node(data);
		size++;
		
		if(head == null) {
			head = node;
			return;
		}
		
		Node last = goToLast();
		
		last.next = node;
	}
	
	public T getFirst() {
		return head.value;
	}
	
	public T getLast() {
		Node last = goToLast();
		return last.value;
	}
	
	public int size() {
		return this.size;
	}

}
