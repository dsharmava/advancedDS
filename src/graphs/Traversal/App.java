package graphs.Traversal;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
    	
    	
    	Vertex v1 = new Vertex(1);
    	Vertex v2 = new Vertex(2);
    	Vertex v3 = new Vertex(3);
    	Vertex v4 = new Vertex(4);
    	Vertex v5 = new Vertex(5);
    	
    	v1.addToAdjacencyList(v2);
    	v1.addToAdjacencyList(v3);
    	v3.addToAdjacencyList(v4);
    	v4.addToAdjacencyList(v5);
    	
    	List<Vertex> list = new ArrayList<Vertex>();
    	list.add(v1);
    	list.add(v2);
    	list.add(v3);
    	list.add(v4);
    	list.add(v5);
    	
    	
        DFS obj_dfs = new DFS(list);
        
       //All of the following valid calls 
//    	BFS obj_bfs = new BFS(list);
    	
//    	DFS obj_dfs = new DFS();
//    	BFS obj_bfs = new BFS();
//    	
//    	obj_bfs.bfs(v1);
//    	obj_dfs.dfs(v1);
    	
    }
}
