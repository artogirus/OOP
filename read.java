package finalize;


import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author Tran Quang Khoi
 */



public class read {
	public int vertex = 0;
	public int[][] arr = new int[100][100];
    public void loadData () throws FileNotFoundException, IOException {
        File file =  chooseTextFile();
        FileReader fr = new FileReader(file);
        LineNumberReader lnr = new LineNumberReader(fr);
        int lineNumber = 0;
        while (lnr.readLine() != null) {
            lineNumber++;
        }
        int[][] arr = new int[lineNumber][lineNumber];
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            for (int i = 0; i < arr.length; i++){
                String[] line = sc.nextLine().trim().split(" ");
                for (int j = 0; j < line.length - 1; j++){
                    arr[i][j] = Integer.parseInt(line[j+1]);
                }
            }
        }
        
        this.vertex = arr.length;
        this.arr = arr;
        /*
        int[][] matrix = new int[vertex+1][vertex+1];
		
		ArrayList<Edge> edgeList = new ArrayList<Edge>();
		for (int i = 0; i < vertex;i++) {
			for (int j = 0; j < vertex; j++)
			{
				if (arr[i][j]>0) {edgeList.add(new Edge(i+1,arr[i][j]));}
			}
		}
		System.out.println();
		for (int i=0;i<edgeList.size();i++) {
			Edge currentEdge = edgeList.get(i);
			int startVertex = currentEdge.startVertex;
			int endVertex = currentEdge.endVertex;
			matrix[startVertex][endVertex] = 1;
		}
		
		for (int i = 1;i<=vertex;i++) {
			for (int j=1;j<=vertex;j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		} */
    }
    private static File chooseTextFile() {
        FileDialog dialog = new FileDialog((Frame) null, "Select file");
        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);
        File[] file; 
        file = dialog.getFiles();
        return file[0];
    }   
}