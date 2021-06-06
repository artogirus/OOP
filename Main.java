import java.io.IOException;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException{
		read yomu = new read();
    	yomu.loadData();
		String m,n;
    	Graph g = new Graph();
    	
    	// khoi tao do thi thi du lieu da doc 
		for (int i = 0; i < yomu.vertex;i++) {
			for (int j = 0; j < yomu.vertex; j++)
			{
				if ((yomu.arr[i][j])>0) {
					m = String.valueOf(i+1);
					n = String.valueOf(yomu.arr[i][j]);
					g.addEdge(m, n);
				}
			}
		}
		
		
		// code tim duong di
		LinkedList<String> visited = new LinkedList();
		visited.add("1"); // them diem bat dau
		Search sagasu = new Search("1","4"); // khoi tao doi tuong search gom diem bat dau va diem ket thuc
		sagasu.depthFirst(g,visited); // goi method depthFist de tim diem bat dau va ket thuc
    	
	}

}
