package Ds;

public class insertion_sort {

	static int[] insertion_sor(int A[], int n) {
		for (int i = 0; i < n; i++) {
			int temp = A[i];
			int j = i;

			while (j > 0 && temp < A[j - 1]) {
				j = j - 1;
			}
			A[j] = temp;
		}
		System.out.println();
		return A;
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 12, 22, 56, 67, 67, 88, 142 };
		int[] arr2 = insertion_sor(arr1, arr1.length);
		for (int i : arr2) {
			System.out.print(i);
			System.out.print(", ");
		}
	}

}
