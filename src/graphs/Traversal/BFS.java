package graphs.Traversal;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	public void bfs(Vertex source) {
		Queue<Vertex> q = new LinkedList<Vertex>();
		
		if(source != null){
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
