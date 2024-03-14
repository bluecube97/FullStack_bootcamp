package day4;

import java.util.Scanner;

public class day4_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] menu = new int[3]; // 메뉴 고르는 배열
		int i = 0;
		int[] drink = new int[3]; // 0. 아메, 1. 라떼, 2. 카푸치노 몇잔?

		for (i = 0; i < menu.length; i++) {
			System.out.println("-----먹고 싶은 메뉴를 고르세요-----");
			System.out.println("1. 아메리카노, 2. 라떼, 3. 카푸치노");
			System.out.println("   1,000원    1500원    2000원");
			System.out.println("그만 고르고 싶으시면 0번을 입력하세요.");
			System.out.println("------------------------------");
			menu[i] = sc.nextInt();
			if (menu[i] == 0)
				break;
		}

		for (i = 0; i < menu.length; i++) {
			if (menu[i] == 0) {
				break;
			}
			if (menu[i] == 1) {
				System.out.println("아메리카노를 고르셨네요. 몇 잔 드시나요?");
				drink[0] = sc.nextInt();
			} else if (menu[i] == 2) {
				System.out.println("라떼를 고르셨네요. 몇 잔 드시나요?");
				drink[1] = sc.nextInt();
			} else if (menu[i] == 3) {
				System.out.println("카푸치노를 고르셨네요. 몇 잔 드시나요?");
				drink[2] = sc.nextInt();
			}
		}

		if (drink[0] > 0) {
			System.out.printf("아메리카노 " + drink[0] + "잔 ");
		}
		if (drink[1] > 0) {
			System.out.printf("라떼 " + drink[1] + "잔 ");
		}
		if (drink[2] > 0) {
			System.out.printf("카푸치노 " + drink[2] + "잔 ");
		}

		int result = 1000 * drink[0] + 1500 * drink[1] + 2000 * drink[2];
		System.out.println("고르셨습니다. ");
		System.out.println("가격은: " + result + "원 입니다.");
		
		System.out.println("감사합니다.");

	}
}
