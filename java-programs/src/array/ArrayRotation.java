/**
 * Test
 */
package array;

/**
 * Test
 */
public class ArrayRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = { 2, 1, 4, 6, 7, 0 };
		int d = 2;
		
		int temp[] = new int[d];
		
		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}
		for (int i : temp) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = temp.length - 1; i < arr.length; i++) {
			arr[i] =  arr[i] + temp[i];
		}

		for (int i : arr) {
			System.out.print(i+" ");
		}

	}

}
