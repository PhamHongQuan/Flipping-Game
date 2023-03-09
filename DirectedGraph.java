package Euler_Tuan2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class DirectedGraph extends Graph {
	public static void main(String[] args) {
		DirectedGraph d = new DirectedGraph(6);
		d.addEdge(0, 1);
		d.addEdge(1, 2);
		d.addEdge(1, 3);
		d.addEdge(2, 4);
		d.addEdge(3, 0);
		d.addEdge(4, 1);
		d.addEdge(5, 4);
		d.addEdge(3, 5);
		d.printMatrix();
		System.out.println(d.eulerPath(3));
	}

	public DirectedGraph(int n) {
		super(n);
	}

	@Override
	public void addEdge(int u, int v) {
		if (u > matrix.length || v > matrix.length) {
			System.out.println("Canh khong hop le !");
		} else {
			matrix[u][v]++;
		}
	}

	@Override
	public boolean isEulerCycle() {
		boolean flag = false;
		for (int i = 0; i < matrix.length; i++) {
			int degIn = 0;
			int degOut = 0;
			for (int j = 0; j < matrix.length; j++) {
				degIn += matrix[i][j];
				degOut += matrix[j][i];
			}
			if (degIn == degOut) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}

		return flag;
	}

	@Override
	public boolean isEulerPath() {
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			int degIn = 0;
			int degOut = 0;
			for (int j = 0; j < matrix.length; j++) {
				degIn += matrix[i][j];
				degOut += matrix[j][i];
			}
			if (degIn == degOut) {
				flag = true;
			} else {
				count++;
				if (degIn == degOut + 1 || degOut == degIn + 1 && count <= 2) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	@Override
	public List<Integer> eulerCycle(int v) {
		if (isEulerCycle()) {
			List<Integer> eulerCycle = new ArrayList<>();
			Stack<Integer> stack = new Stack<>();
			stack.push(v);
			while (!stack.isEmpty()) {
				v = stack.peek();
				if (hasConnected(v)) {
					int u = getFirstVertex(v);
					stack.push(u);
					removeEdge(v, u);
				} else {
					int tmp = stack.pop();
					eulerCycle.add(tmp);
				}
			}
			Collections.reverse(eulerCycle);
			return eulerCycle;
		}
		return null;
	}

	private void removeEdge(int v, int u) {
		matrix[v][u] = 0;
	}

	private int getFirstVertex(int v) {
		int vertex = 0;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[v][i] > 0) {
				vertex = v;
				break;
			}
		}

		return vertex;
	}

	private boolean hasConnected(int v) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[v][i] > 0) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Integer> eulerPath(int v) {
		if (isEulerPath() && isContain(v)) {
			List<Integer> eulerPath = new ArrayList<>();
			Stack<Integer> stack = new Stack<>();
			stack.push(v);
			while (!stack.isEmpty()) {
				v = stack.peek();
				if(hasConnected(v)) {
					int u = getFirstVertex(v);
					stack.push(u);
					removeEdge(v, u);
				}else {
					int tmp = stack.pop();
					eulerPath.add(tmp);
				}
			}
			return eulerPath;
		}
		return null;
	}

	private boolean isContain(int v) {
		boolean flag = false;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < matrix.length; i++) {
			int degIn = 0;
			int degOut = 0;
			for (int j = 0; j < matrix.length; j++) {
				degIn += matrix[i][j];
				degOut += matrix[j][i];
			}
			if ((degIn + degOut) % 2 != 0) {
				list.add(i);
			}
		}
		if (list.contains(v)) {
			flag = true;
		}
		return flag;
	}

}
