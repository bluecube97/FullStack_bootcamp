package day2;

import java.util.Scanner;

public class day2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str1 = sc.next();
		String str2 = sc.next();

		int n1 = Integer.valueOf(str1);
		int n2 = Integer.valueOf(str2);

		if (n1 + n2 >= 20)
			System.out.println("안녕");
		else
			System.out.println("가세요");
	}

}
