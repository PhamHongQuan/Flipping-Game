package Euler_Tuan2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class UndirectedGraph extends Graph {

	public UndirectedGraph(int n) {
		super(n);
	}

	@Override
	public void addEdge(int u, int v) {
		if (u > matrix.length || v > matrix.length) {
			System.out.println("Canh khong hop le !");
		} else {
			matrix[u][v]++;
			matrix[v][u]++;
		}
	}

	@Override
	public List<Integer> eulerCycle(int v) {
		if (isEulerCycle()) {
			List<Integer> eulerCycle = new ArrayList<>();
			Stack<Integer> stack = new Stack<>();
			stack.push(v);
			while (!stack.isEmpty()) {
				v = stack.peek();
				if (isConected(v)) {
					int u = getVertexHasConnected(v);
					stack.push(u);
					deleteEdge(u, v);
				} else {
					int tmp = stack.pop();
					eulerCycle.add(tmp);
				}
			}
			return eulerCycle;
		}
		return null;
	}

	private void deleteEdge(int u, int v) {
		matrix[u][v] = matrix[v][u] = 0;
	}

	private int getVertexHasConnected(int v) {
		int rs = 0;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[v][i] > 0) {
				rs = i;
				break;
			}
		}
		return rs;
	}

	private boolean isConected(int v) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[v][i] > 0) {
				return true;
			}
		}
		return false;
	}

	private List<Integer> getFirstVertexOdd() {
		List<Integer> rs = new ArrayList<>();
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix.length; j++) {
				sum += matrix[i][j];
			}
			if (sum % 2 != 0) {
				rs.add(i);
			}
		}
		return rs;
	}

	@Override
	public List<Integer> eulerPath(int v) {
		if (isEulerPath() && getFirstVertexOdd().contains(v)) {
			List<Integer> eulerPath = new ArrayList<>();
			// TO DO
			Stack<Integer> stack = new Stack<>();
			stack.push(v);
			while (!stack.isEmpty()) {
				v = stack.peek();
				if (isConected(v)) {
					int u = getVertexHasConnected(v);
					stack.push(u);
					deleteEdge(u, v);
				} else {
					int tmp = stack.pop();
					eulerPath.add(tmp);
				}
			}
			Collections.reverse(eulerPath);
			return eulerPath;
		}
		return null;
	}

	@Override
	public boolean isEulerCycle() {
		boolean flag = false;
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix.length; j++) {
				sum += matrix[i][j];
			}
			if (sum % 2 == 0) {
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
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix.length; j++) {
				sum += matrix[i][j];
			}
			if (sum % 2 == 0) {
				flag = true;
			} else {
				if (hasTwoVertexOdd()) {
					flag = true;
				} else {
					flag = false;
				}
			}
		}
		return flag;
	}

	private boolean hasTwoVertexOdd() {
		boolean flag = false;
		int index = 0;
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix.length; j++) {
				sum += matrix[i][j];
			}

			if (sum % 2 == 0) {
				flag = true;
			} else {
				index++;
			}

		}
		if (index > 2) {
			flag = false;
		}
		return flag;
	}

}
