package graphs.dijkstras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijkastraAlgorithm {
    
	public void computePaths(Vertex source){
		//TODO: set source distance 0
		source.setDistance(0.0);
		PriorityQueue<Vertex> q = new PriorityQueue<Vertex>();
		
		q.add(source);
		
		//TODO: calculate new distance values for each adjacent vertex
		while(!q.isEmpty()){
			Vertex actualVertex = q.poll();
			for(Edge e : actualVertex.getAdjacencyList()){
				 Vertex v = e.getDestination();
				 double newDistance = actualVertex.getDistance()+e.getWeight();
				 
				 if(newDistance < v.getDistance()){
					 q.remove(v);
					 v.setDistance(newDistance);
					 v.setPredecessor(actualVertex);
					 q.add(v);
				 }
			}
		}
	}
	
	public List<Vertex> getShortestPath(Vertex targetVertex){
		 List<Vertex> path = new ArrayList<Vertex>();
		 
		 for(Vertex v = targetVertex; v != null; v = v.getPredecessor()){
			 path.add(v);
		 }
		 
		 Collections.reverse(path);
		 
		 return path;
	}
}
