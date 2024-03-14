package smart_phone;

import java.util.Scanner;

public class sm_controll {
	Scanner sc = new Scanner(System.in);
	sm_var var = new sm_var();
	sm_sequence sq = new sm_sequence();
	sm_pow sp = new sm_pow();
	sm_yt sy = new sm_yt();
	sm_ch sch = new sm_ch();
	sm_vol sv = new sm_vol();
	sm_call sca = new sm_call();
	sm_phone_book spb = new sm_phone_book();

	public void sm_con() {
		while (true) {
			if (!var.isSMon()) {
				System.out.println("전원 버튼 누르기(아무거나 입력하세요.)");
				sc.next(); // 아무 입력이나 받으면 다음으로 넘어감
				sp.sm_pow_push(var); // 전원이 켜져있으면 끄고, 전원이 꺼져있으면 켬
			} else {
				sq.sm_anno(); // 안내문구 출력
				var.setMenu_selec(sc.next()); // 사용자가 뭘 할지 입력받음
				var.setMenu_selec(var.getMenu_selec().toUpperCase()); // 소문자를 대문자로 변환
				// menu_selec 변수에 입력받은 값에 따라 실행
				sq.sm_sq(var, sy, sch, sca, spb, sv, sp);
				// 스마트폰이 켜져있으면 현재 어플 구동 여부 출력 및 현재 볼륨 출력
				if (var.isSMon()) {
					sq.sm_now(var);
				}
			}
		}
	}
}
