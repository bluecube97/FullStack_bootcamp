package day3;

import java.util.Scanner;

public class day3_2 {

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

		switch (cal) {
		case ("+"):
			result = n1 + n2;
			break;
		case ("-"):
			result = n1 - n2;
			break;
		case ("*"):
			result = n1 * n2;
			break;
		case ("/"):
			float fn1 = n1;
			float fn2 = n2;
			result_f = fn1 / fn2;
			div = true;
			break;
		default:
			System.out.println("wrong input!!");
			break;
		}

		if (div == false) {
			System.out.println(result);
		} else if (div == true) {
			System.out.println(result_f);
		}

	}

}
