package graphs.Traversal;

import java.util.List;
import java.util.Stack;

public class DFS {
	
	public DFS(List<Vertex> list){
		for(Vertex v : list){
			if(!v.isVisited()){
				dfs(v);
			}
		}
	}
	
	public DFS(){}
	
   public void dfs(Vertex source){
	   Stack<Vertex> s = new Stack<Vertex>();
	  if(source != null && !source.isVisited()){ 
	   s.push(source);
	   source.setVisited(true);

	   while(!s.isEmpty()){
		   Vertex temp = s.pop();
		   System.out.println(temp.getData());
		   for(Vertex v : temp.getAdjacencyList()){
			   if(! v.isVisited()){
				   v.setVisited(true);
				   s.push(v);
			   }
		   }
	   }
	  }
   }
}
