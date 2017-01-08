package graphs.dijkstras;

public class App {
   public static void main(String[] args){
	   Vertex v0 = new Vertex("A");
	   Vertex v1 = new Vertex("B");
	   Vertex v2 = new Vertex("C");
	   Vertex v3 = new Vertex("D");
	 
	   v0.addNeighbor(new Edge(v0,v1,1.0));
	   v0.addNeighbor(new Edge(v0,v2,1.0));
	   v1.addNeighbor(new Edge(v1,v2,1.0));
	   v1.addNeighbor(new Edge(v1,v3,1.0));
	   v2.addNeighbor(new Edge(v2,v3,0.0));
	   
	   DijkastraAlgorithm obj = new DijkastraAlgorithm();
	   obj.computePaths(v0);
	   
	   System.out.println(obj.getShortestPath(v3));
   }
}
