package array;

public class MinimumElementOfArray {

	public static void main(String[] args) {
		
		int arr[] = {1,56,8,72,99,4};
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("the maximum value in the given array is : "+min);

	}

}
