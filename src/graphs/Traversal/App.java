package graphs.Traversal;

public class App {
    public static void main(String[] args){
    	BFS obj = new BFS();
    	
    	Vertex v1 = new Vertex(1);
    	Vertex v2 = new Vertex(2);
    	Vertex v3 = new Vertex(3);
    	Vertex v4 = new Vertex(4);
    	Vertex v5 = new Vertex(5);
    	
    	v1.addToAdjacencyList(v2);
    	v1.addToAdjacencyList(v4);
    	v4.addToAdjacencyList(v5);
    	v2.addToAdjacencyList(v3);
    	
    	obj.bfs(v1);
    	
    }
}
