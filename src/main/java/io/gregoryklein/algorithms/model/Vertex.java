package io.gregoryklein.algorithms.model;

/**
 * @author gregory.klein
 *
 */
public class Vertex {
	String label;
	boolean visited;
	
	public Vertex(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public boolean isVisited() {
		return visited;
	}
	
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	@Override
	public String toString() {
		return label;
	}
}
