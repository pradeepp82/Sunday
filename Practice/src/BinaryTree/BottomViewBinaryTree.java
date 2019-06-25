package BinaryTree;

import java.util.Map;
import java.util.TreeMap;

public class BottomViewBinaryTree {

	
	private static void printBottom(Node root) {
		 Map<Integer, Pair<Integer, Integer>> map = new TreeMap<>();
		 
		 printBottom(root, 0, 0, map);
		 for (Pair<Integer, Integer> it: map.values()) {
				System.out.print(it.first + " ");
			}
		
	}
	
	
	
	
	private static void printBottom(Node root, int dist, int level, Map<Integer, Pair<Integer, Integer>> map) {
		
		if (root==null) {
			return;
		}
		
		if (!map.containsKey(dist)||level>=map.get(dist).second) {
			map.put(dist, Pair.of(root.key, level));
			
		}
		
		printBottom(root.left, dist - 1, level + 1, map);
		printBottom(root.right, dist + 1, level + 1, map);
	}




	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.right = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.left.left = new Node(7);
		root.right.left.right = new Node(8);

		printBottom(root);
	}

}
