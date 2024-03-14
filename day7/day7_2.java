package day7;

public class day7_2 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		int[] value = null;
		value = new int[5];
		int[] div = null;
		div = new int[5];

		for (int i = 0; i < div.length; i++) {
			div[i] = 10;
		}

		for (int i = 0; i < div.length; i++) {
			int n = div[i];
			div[i] = get_square(n, i); // n ^ i
		}

		int[] result = null;
		result = new int[5];

		for (int i = 0; i < value.length; i++) {
			value[i] = num / div[4 - i];
		}
		
		result[0] = value[0];

		for (int i = 0; i < value.length - 1; i++) {
			result[i + 1] = value[i + 1] - value[i] * 10;
		}

		for (int i = 0; i < value.length; i++) {
			sum = sum + result[i];
		}

		System.out.println("sum = " + sum);
	}

	public static int get_square(int num, int i) {	//10, 5
		if (i == 0) {
			return 1;
		} else {
			return num * get_square(num, i - 1);
		}
	}

}
