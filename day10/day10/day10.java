package day10;

import java.util.Scanner;

public class day10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserInfo ui = new UserInfo();
		UserCheck uc = new UserCheck();

		System.out.println("ID를 입력하세요.");
		String userId = sc.next();
		System.out.println("PW를 입력하세요.");
		String userPw = sc.next();
		System.out.println("연산기호를 입력하세요.");
		String oper = sc.next();

		ui.userId = userId;
		ui.userPw = userPw;
		ui.oper = oper;

		boolean check = uc.userCheck(ui);

		if (check) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("로그인 실패했습니다.");
		}

	}

}
