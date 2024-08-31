package array;

public class SumOfUniqueElementsInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 45, 45, 65, 34, 65, 2, 6 };
		System.out.println("Original Array ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		int sum = 0;
		System.out.println("\nDistinct Array : ");
		
		for (int i = 0; i < arr.length; i++) {
			
			boolean isDuplicate = false;
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
				}
			}
			
			if (!isDuplicate) {
				System.out.print(arr[i] + " ");
				sum += arr[i];
			}

		}
		System.out.println("\nSum of distinct array is : " + sum);
	}

}
