package day2;

import java.util.Scanner;
import java.util.Random;

public class day2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		String name = sc.next();
		int dice = rd.nextInt(6) + 1;
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		String strnum = sc.next();

		System.out.println(name + ", " + dice);

		int mul_int = n1 * n2 * n3;
		float mul_float = mul_int;
		float f4 = Integer.valueOf(strnum);
		float result_float = mul_float / f4;

		System.out.println(result_float);

		sc.close();
	}

}
