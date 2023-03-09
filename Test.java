package Euler_Tuan2;

public class Test {
	
	public static void main(String[] args) {
		 Graph undirGraph = new UndirectedGraph(5);
		 undirGraph.addEdge(0, 1);
		 undirGraph.addEdge(0, 3);
		 undirGraph.addEdge(1, 2);
		 undirGraph.addEdge(1, 3);
		 undirGraph.addEdge(1, 4);
		 undirGraph.addEdge(2, 3);
		 undirGraph.addEdge(2, 4);
		 undirGraph.printMatrix();
//		 System.out.println("Do thi co chu trinh khong: "+undirGraph.isEulerCycle());
//		 System.out.println("Chu trinh Euler: "+undirGraph.eulerCycle(0));
//		 System.out.println(undirGraph.isEulerPath());
		 System.out.println(undirGraph.eulerPath(2));
		 
	}
}
