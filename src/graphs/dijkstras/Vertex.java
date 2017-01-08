package graphs.dijkstras;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {
	private String name;
	private Vertex predecessor;
	private Double distance = Double.MAX_VALUE;
	private List<Edge> adjacencyList;
	private boolean visited;

	Vertex(String name){
		this.name = name;
		this.adjacencyList = new ArrayList<Edge>();
	}
	
	@Override
	public String toString(){
		return this.name;
	}
	
	@Override
	public int compareTo(Vertex v) {
		return Double.compare(this.distance, v.distance);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vertex getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public List<Edge> getAdjacencyList() {
		return adjacencyList;
	}

	public void setAdjacencyList(List<Edge> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}

	public void addNeighbor(Edge e){
		this.adjacencyList.add(e);
	}
	
	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

}
