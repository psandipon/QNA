package Sorting;

public class tester {

	public static void main(String[] args) {

		int[] arr = generateRandomArray();
		printArray(arr, "Array Before Sort");
		arr = new BubbleSort().Sort(arr); // using bubble sort
		printArray(arr, "Array After Sort");

		arr = generateRandomArray();
		printArray(arr, "Array Before Sort");
		arr = new InsertionSort().Sort(arr); // using Insertion sort
		printArray(arr, "Array After Sort");

		arr = generateRandomArray();
		printArray(arr, "Array Before Sort");
		arr = new SelectionSort().Sort(arr); // using Selection sort
		printArray(arr, "Array After Sort");

	}

	private static int[] generateRandomArray() {
		int[] arr = new int[(int) (Math.random() * 10)];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ((int) (Math.random() * 10));
		}
		return arr;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void printArray(int[] arr, String message) {
		System.out.println(message);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
