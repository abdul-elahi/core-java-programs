package array;

public class MaximumElementOfArray {

	public static void main(String[] args) {
		
		int arr[] = {1,56,8,72,99,4};
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("the maximum value in the given array is : "+max);

	}

}
