package array;

public class RemoveDuplicatesInAnArray {

	public static void main(String[] args) {
		int arr[] = {1,45,45,65,34,65,2,6};
	
		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					isDuplicate=true;
				}
			}
			if (!isDuplicate) {
				System.out.print(arr[i]+" ");
			}
			
		}
	}

}
