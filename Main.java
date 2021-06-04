package finalize;


import java.io.IOException;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
    	read yomu = new read();
    	yomu.loadData();
    	
    	Graph g = new Graph(yomu.vertex);
		for (int i = 0; i < yomu.vertex;i++) {
			for (int j = 0; j < yomu.vertex; j++)
			{
				if ((yomu.arr[i][j])>0) {
					g.addEdge(i, yomu.arr[i][j]-1);
				}
			}
		}
		
		System.out.println("Depth First Traversal for given graph"+ 
                "(with 0 as starting vertex)");
		
		g.DFS(0); 
		
    } 

}
