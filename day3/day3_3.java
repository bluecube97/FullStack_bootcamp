package day3;

import java.util.Scanner;

public class day3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		float result_f = 0;

		System.out.println("동전 개수 입력");
		int n = sc.nextInt();
		System.out.println("동전 단위 입력(10, 50, 100, 500)");
		int coin = sc.nextInt(); // input value == 10, 50, 100, 500

		if (coin != 10 && coin != 50 && coin != 100 && coin != 500) {
			System.out.println("wrong input!!");
		} else {
			result = n * coin;
			System.out.println("총 액은: " + result);
			
			result_f = result;
			System.out.println("10원의 개수는: " + result_f / 10);
			System.out.println("50원의 개수는: " + result_f / 50);
			System.out.println("100원의 개수는: " + result_f / 100);
			System.out.println("500원의 개수는: " + result_f / 500);

		}
		
		System.out.println(result);

	}

}
