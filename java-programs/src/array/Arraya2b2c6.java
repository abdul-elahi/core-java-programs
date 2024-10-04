package array;

public class Arraya2b2c6 {

	public static void main(String[] args) {
//		input a5b2c6
//		output aaaaabbcccccc
		String str = "a9b2c6";

	     StringBuffer result = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			System.out.println(letter);
			i++;
			int count = Character.getNumericValue(str.charAt(i));
			System.out.println(count);
			for (int j = 0; j < count; j++) {
				result.append(letter);
			}
		}
		System.out.println(result.toString());
	}
}
