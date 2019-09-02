package io.gregoryklein.algorithms.algo.treesearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import io.gregoryklein.algorithms.model.Vertex;

/**
 * @author gregory.klein
 *
 */
public class DepthfirstSearch {
	
	private Vertex[] vertices;
	private int[][] adjMatrix;
	private Stack<Integer> stack = new Stack<>();
	
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
	
	public List<Vertex> search() {
		List<Vertex> result = new ArrayList<>();
		vertices[0].setVisited(true);
		result.add(vertices[0]);
		stack.push(0);

		while(!stack.empty()) {
			int unvisitedVertex = getAdjacentUnvisitedVertex(stack.peek());

			if(unvisitedVertex == -1) {
				stack.pop();
			} else {
				vertices[unvisitedVertex].setVisited(true);
				result.add(vertices[unvisitedVertex]);
				stack.push(unvisitedVertex);
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
