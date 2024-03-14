package day4;

import java.util.Scanner;

public class day4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result = 0;

		System.out.println("몇개나 계산할거임?");
		int count = sc.nextInt();
		int[] calc_val;
		calc_val = new int[count];

		for (int i = 0; i < count; i++) {
			calc_val[i] = sc.nextInt();
		}
		
		for(int i = 0; i < count; i++) {
			result += calc_val[i];
		}
		System.out.println(result);
	}

}
