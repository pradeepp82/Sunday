package BinaryTree;

public class BinaryTreeMirror {

	private static void preorder(Node root) {
		if (root == null) {
			return;
		}

		System.out.print(root.key);
		preorder(root.left);
		preorder(root.right);
	}

	private static void swap(Node root) {
		if (root == null) {
			return;
		}
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
	}

	private static void convertToMirror(Node root) {

		if (root == null) {
			return;

		}

		convertToMirror(root.left);

		convertToMirror(root.right);
		swap(root);

	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		convertToMirror(root);
		preorder(root);

	}

}
