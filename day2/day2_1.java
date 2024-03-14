package day2;

import java.util.Scanner;
import java.util.Random;

public class day2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		int int1 = Integer.valueOf(str1);
		int int2 = Integer.valueOf(str2);
		
		float fnum1 = int1;
		float fnum2 = int2;
		
		float result = fnum1/fnum2;
		System.out.println(result);

		boolean b = (result < 10);

		System.out.println("TOF: " + b);

	}

}
