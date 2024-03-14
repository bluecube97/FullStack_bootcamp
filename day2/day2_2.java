package day2;

import java.util.Scanner;

public class day2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean b = true;
		System.out.println("java점수 입력");
		int java = sc.nextInt();
		System.out.println("html점수 입력");
		int html = sc.nextInt();
		System.out.println("c점수 입력");
		int c = sc.nextInt();
		System.out.println("js점수 입력");
		int js = sc.nextInt();
		int sum = java + html + c + js;

		if (java < 60 || html < 60 || c < 60 || js < 60) {
			System.out.println("과락입니다...");
			b = false;
		} else if (java >= 60) {
			System.out.println("과락은 면함!!");
			b = true;
		}

		if (sum < 240 && b == true) {
			System.out.println("총점 불합격...");
		} else if (sum >= 240 && b == false) {
			System.out.println("과락입니다...");
		} else if(sum < 240 && b == false) {
			System.out.println("어케 둘다 불합격이냐;;");
		} else if (sum >= 240 && b == true) {
			System.out.println("최종합격!!");
		}

	}

}
