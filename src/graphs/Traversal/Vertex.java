package graphs.Traversal;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private int data;
	private boolean isVisited;
	private List<Vertex> adjacencyList;

	public Vertex(int data) {
		this.adjacencyList = new ArrayList<Vertex>();
		this.data = data;
	}

	public void addToAdjacencyList(Vertex node){
		this.adjacencyList.add(node);
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public List<Vertex> getAdjacencyList() {
		return adjacencyList;
	}

	public void setAdjacencyList(List<Vertex> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}

}
