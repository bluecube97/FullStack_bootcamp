package smart_phone;

import java.util.Scanner;

public class sm_call {
	Scanner sc = new Scanner(System.in);

	public void calling(sm_var var) {
		System.out.println("전화번호를 입력하세요.");
		var.setTel_num(sc.next());
		
		// 3초간 딜레이
		try {
			System.out.println(var.getTel_num() + " 로 전화를 거는 중 입니다.");
			Thread.sleep(1000);
			System.out.println(var.getTel_num() + " 로 전화를 거는 중 입니다..");
			Thread.sleep(1000);
			System.out.println(var.getTel_num() + " 로 전화를 거는 중 입니다...");
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("전화가 연결되었습니다.");
		// 아무 입력이나 받으면 통화종료
		System.out.println("통화를 종료하시려면 아무거나 입력하세요.");
		sc.next();
		System.out.println("통화가 종료되었습니다.");
		
	}

}
