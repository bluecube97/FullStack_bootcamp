package day5;

import java.util.Scanner;

public class day5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num;
		num = new int[3];
		float[] num_f;
		num_f = new float[3];
		int result = 0;
		float result_f = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		String oper = sc.next();

		if (oper.equals("더하기")) {
			for (int i = 0; i < num.length; i++) {
				result += num[i];
			}
			System.out.println(result);
		} else if (oper.equals("빼기")) {
			 result = num[0];
			for (int i = 1; i < num.length; i++) {
				result -= num[i];
			}
			System.out.println(result);
		} else if (oper.equals("곱하기")) {
			result = num[0];
			for (int i = 1; i < num.length; i++) {
				result *= num[i];
			}
			System.out.println(result);
		} else if (oper.equals("나누기")) {
			num_f[0] = num[0];
			result_f = num_f[0];
			for (int i = 1; i < num.length; i++) {
				num_f[i] = num[i];
				result_f /= num_f[i];
			}
			System.out.println(result_f);
		}
	}

}
