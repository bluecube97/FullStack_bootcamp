package smart_phone;

import java.util.Scanner;

public class sm_phone_book {
	Scanner sc = new Scanner(System.in);
	String[] phone_book = new String[10];
	int cnt = 0;
	int del = 0;

	public void phone_book_open(sm_var var) {
		System.out.println("현재 등록된 번호는");

		phone_book = var.getPhone_book();

		for (int i = 0; i < cnt; i++) {
			System.out.println(i + 1 + ". " + phone_book[i]);
		}
		System.out.println("입니다.");

		while (true) {
			System.out.println("전화번호를 등록하려면 1을");
			System.out.println("전화번호를 삭제하려면 2를");
			System.out.println("종료하려면 3를 입력하세요.");

			var.setPBon(sc.nextInt());
			System.out.println("전화번호를 입력하세요.");
			if (var.getPBon() == 1) {
				phone_book[cnt] = sc.next();
				cnt++;
			} else if (var.getPBon() == 2) {
				System.out.println("삭제할 전화번호의 번호를 입력하세요.");
				System.out.println("현재 등록된 전화번호는");
				for (int i = 0; i < cnt; i++) {
					System.out.println(i + 1 + ". " + phone_book[i]);
				}
				System.out.println("입니다.");
				
				del = sc.nextInt();
				phone_book[del - 1] = " ";
				
			} else if (var.getPBon() == 3) {
				System.out.println("전화번호 등록을 종료합니다.");
				System.out.println("현재 등록된 전화번호는");
				for (int i = 0; i < cnt; i++) {
					System.out.println(i + 1 + ". " + phone_book[i]);
				}
				System.out.println("입니다.");
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
