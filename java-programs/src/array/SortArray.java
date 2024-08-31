package array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		int arr[] = { 2, 1, 5, 4, 9, 7, 8, 5, 0 };
		
		System.out.println("Before Sorting");
		
		for (int i : arr) {

			System.out.print(i + " ");
		}
		
		// using library function
		Arrays.sort(arr);
		System.out.println("\nUsing Library Function");
		for (int i : arr) {

			System.out.print(i + " ");
		}
		
		// using selection sort we can sort array
		System.out.println("\nUsing Mannual Method");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

			System.out.print(arr[i] + " ");
		}
	}

}
