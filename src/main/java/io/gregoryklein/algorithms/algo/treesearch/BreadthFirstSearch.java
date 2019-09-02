package io.gregoryklein.algorithms.algo.treesearch;

import java.util.ArrayList;
import java.util.List;

import io.gregoryklein.algorithms.model.Vertex;
import sun.misc.Queue;

/**
 * @author gregory.klein
 *
 */
@SuppressWarnings("restriction")
public class BreadthFirstSearch {
	
	private Vertex[] vertices;
	private int[][] adjMatrix;
	private Queue<Integer> queue = new Queue<>();
	
	private int vertexCount = 0;
	
	public void setMax(int max) {
		vertices = new Vertex[max];
		adjMatrix = new int[max][max];
	}
	
	public void addVertex(String label) {
		vertices[vertexCount++] = new Vertex(label);
	}

	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}
	
	public List<Vertex> breadthFirstsearch() throws InterruptedException {
		List<Vertex> result = new ArrayList<>();
		int unvisitedVertex;
		
		vertices[0].setVisited(true);
		result.add(vertices[0]);
		queue.enqueue(0);
		
		while(!queue.isEmpty()) {
			int tempVertex = queue.dequeue();
			
			while((unvisitedVertex = getAdjacentUnvisitedVertex(tempVertex)) != -1) {
				vertices[unvisitedVertex].setVisited(true);
				result.add(vertices[unvisitedVertex]);
				queue.enqueue(unvisitedVertex);
			}
		}
		
		resetVisitedFlags();
		
		return result;
	}
	
	private int getAdjacentUnvisitedVertex(int vertexIndex) {
		for (int i = 0; i < vertexCount; i++) {
			if(adjMatrix[vertexIndex][i] == 1 && !vertices[i].isVisited())
				return i;
		}

		return -1;
	}
	
	public void resetVisitedFlags() {
		for (int i = 0; i < vertexCount; i++) {
			vertices[i].setVisited(false);
		}
	}

}
