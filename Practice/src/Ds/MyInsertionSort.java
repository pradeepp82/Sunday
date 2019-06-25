package Ds;

public class MyInsertionSort {

	public static void main(String a[]) {
		int[] arr1 = { 2, 7, 10, 34, 42, 56, 67, 88 };
		int[] arr2 = doInsertionSort(arr1);
		for (int i : arr2) {
			System.out.print(i);
			System.out.print(", ");
		}
	}

	public static int[] doInsertionSort(int[] input) {

		int tmp;
		for (int i = 1; i < input.length; i++) {
			for (int j = i; j > 0; j--) {
				if (input[j] < input[j - 1]) {
					tmp = input[j - 1];
					input[j - 1] = input[j];
					input[j] = tmp;
				}
			}

		}

		return input;
	}
}