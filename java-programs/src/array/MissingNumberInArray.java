package array;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6 };
		int d = arr.length + 1;
		// if the above array is perfect the sum of array should be 21
		// but now it is 17 if we subtract 21 by 17 we will get missing number i.e 4
		// using n find out actual sum
		int expSum = d * (d + 1) / 2; // (6*(7)/2) = 6*3.5 = 21
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			// add the all elements
			sum += arr[i];
		}
		int missing = expSum - sum;
		System.out.println(missing);
	}

}
