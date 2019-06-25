package BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTreeRight {

	private static void rightView(Node root) {

		if (root == null) {
			return;
		}

		Queue<Node> q = new ArrayDeque<>();
		q.add(root);

		Node curr = null;
		while (!q.isEmpty()) {

			int size = q.size();
			int i = 0;
			while (i++ < size) {

				curr = q.poll();

				if (i == 1) {
					System.out.print(curr.key + " ");
				}

				if (curr.right != null) {
					q.add(curr.right);

				}
				if (curr.left != null) {
					q.add(curr.left);

				}
			}
		}

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
		rightView(root);
	}

}
