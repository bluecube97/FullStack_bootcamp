package day3;

import java.util.Scanner;

public class day3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 2개 입력");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int result = 0;
		float result_f = 0;
		boolean div = false;

		System.out.println("연산 기호 입력");
		String cal = sc.next();

		if (cal.equals("+")) {
			result = n1 + n2;
			
		} else if (cal.equals("-")) {
			result = n1 - n2;
			
		} else if (cal.equals("*")) {
			result = n1 * n2;
			
		} else if (cal.equals("/")) {
			float fn1 = Integer.valueOf(n1);
			float fn2 = Integer.valueOf(n2);
			result_f = fn1 / fn2;
			div = true;
			
		} else
			System.out.println("wrong input!");

		if (div == false) {
			System.out.println(result);
		} else if (div == true) {
			System.out.println(result_f);
		}

	}

}
