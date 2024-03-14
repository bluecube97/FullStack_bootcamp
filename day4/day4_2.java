package day4;

import java.util.Scanner;

public class day4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean isEnd = true;
		int i = 0;
		int j = 0;
		int k = 0;
		int result = 0;
		int[] calc_val = new int[3] ;

		while (isEnd) {
			if (i >= 2) {
				isEnd = false;
			}
			calc_val[i] = sc.nextInt();
			i++;
		}
		System.out.println("부호를 입력");
		String op = sc.next();
		
		if (op.equals("+")) {
			while (j < 3) {
				result += calc_val[j];
				j++;
			}
		} else if (op.equals("-")) {
			while (k < 3) {
				result -= calc_val[k];
				k++;
			}
		}

		System.out.println(result);
	}
}
