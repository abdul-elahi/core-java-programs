package array;
import java.util.ArrayList;
import java.util.List;

public class ArrayRightRotation {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = 3;
		int len = arr.length;

		List<Integer> rotatedArray = new ArrayList<>();

		for (int i = n; i < len; i++) {
			rotatedArray.add(i);
		}
		for (int i = 1; i < n; i++) {
			rotatedArray.add(i);
		}

		System.out.println(rotatedArray);

	}

}
