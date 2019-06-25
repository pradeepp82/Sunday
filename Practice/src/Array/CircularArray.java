package Array;

public class CircularArray {

	public static void print(char a[], int n, int ind) {

		char[] b = new char[(2 * n)];

		for (int i = 0; i < n; i++)
			b[i] = b[n + i] = a[i];

		for (int i = ind; i < n + ind; i++)
			System.out.print(b[i] + " ");
	}

	public static void main(String argc[]) {
		char[] a = new char[] { 'A', 'B', 'C', 'D', 'E', 'F' };
		int n = 6;
		print(a, n, 3);
	}
}
