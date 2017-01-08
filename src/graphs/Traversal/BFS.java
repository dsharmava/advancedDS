package graphs.Traversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
	
	public BFS(List<Vertex> list){ // In case there are disconnected graphs
		for(Vertex v : list){
			if(!v.isVisited()){
				bfs(v);
			}
		}
	}
	
	public BFS(){}
	
	public void bfs(Vertex source) {
		Queue<Vertex> q = new LinkedList<Vertex>();
		
		if(source != null && !source.isVisited()){
			q.add(source);
			source.setVisited(true);
		}
		
		while(! q.isEmpty()){
			Vertex temp = q.poll();
			
			System.out.println(temp.getData());
			
			for(Vertex v : temp.getAdjacencyList()){
				if(!v.isVisited()){
					v.setVisited(true);
					q.add(v);
				}
			}
		}
	}
}
