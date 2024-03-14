package day4;

import java.util.Scanner;

public class day4_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int result = 0;
		String oper = "";

		System.out.println("몇 개의 수를 연산합니까?");
		count = sc.nextInt();

		int[] cal_val = null;
		cal_val = new int[count];

		for (int i = 0; i < count * 2 - 1; i++) {
			if (i == 0) {
				System.out.println("숫자 입력");
				cal_val[0] = sc.nextInt();
				result = cal_val[0];

			} else if (i % 2 == 0) {
				System.out.println("숫자 입력");
				cal_val[i / 2] = sc.nextInt();

				if (oper.equals("+")) {
					result += cal_val[i / 2];
				} else if (oper.equals("-")) {
					result -= cal_val[i / 2];
				} else if (oper.equals("*")) {
					result *= cal_val[i / 2];
				}

			} else if (i % 2 == 1) {
				System.out.println("연산자 입력");
				oper = sc.next();
				if(!oper.equals("+") && !oper.equals("-") && 
						!oper.equals("*")) {
					System.out.println("잘못된 연산자 입력입니다.");
					i--;
				}
			}
		}
		System.out.println("계산 결과는: " + result);
	}
}
