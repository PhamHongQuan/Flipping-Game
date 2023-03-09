package Euler_Tuan2;

import java.util.List;

public abstract class Graph {
	int matrix[][];

	public Graph(int n) {
		matrix = new int[n][n];
	}

	/**
	 * them canh vao u, v vao do thi dang ma tran
	 * @param u
	 * @param v
	 */
	public abstract void addEdge(int u, int v);
	
	/**
	 * in do thi duoi dang ma tran
	 * @param matrix
	 */
	public void printMatrix() {
		for(int i = 0; i < matrix.length;i++) {
			for(int j = 0; j < matrix.length;j++) {
				System.out.print(matrix[i][j] +" ");
			}
			System.out.println();
		}
	}
	/**
	 * kiem tra do thi co chu trinh euler khong
	 * @return
	 */
	public abstract boolean isEulerCycle();
	
	/**
	 * kiem tra do thi co duong di euler khong 
	 * @return
	 */
	public abstract boolean isEulerPath();
	
	/**
	 * tim chu trinh euler cua do thi bat dau tai dinh v bat ki
	 * @param v
	 * @return
	 */
	public abstract List<Integer> eulerCycle(int v);
	
	/**
	 * tim duong di euler cua do thiu bat dau tu dinh v bat ki
	 * @param v
	 * @return
	 */
	public abstract List<Integer> eulerPath(int v);
}
