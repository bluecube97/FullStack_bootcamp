package smart_phone;

public class sm_sequence {
	public void sm_anno() {
		System.out.println("*****************************************");
		System.out.println("유튜브를 켜려면 YT or YouTube를 입력하세요.");
		System.out.println("크롬을 켜려면 CH or Chrome을 입력하세요.");
		System.out.println("전화를 걸려면 CA or CALL을 입력하세요.");
		System.out.println("전화번호부를 열려면 PB or PhoneBook을 입력하세요.");
		System.out.println("대/소문자 상관없음");
		System.out.println("볼륨을 높이거나 줄이려면 + / - 를 입력하세요.");
		System.out.println("전원을 끄려면 off 를 입력하세요.");
		System.out.println("*****************************************");
	}
	
	public void sm_sq(sm_var var, sm_yt sy, sm_ch sch, sm_call sca, sm_phone_book spb, sm_vol sv, sm_pow sp) {
		// 유튜브 on/off
		if (var.getMenu_selec().equals("YOUTUBE") || var.getMenu_selec().equals("YT")) {
			sy.youtube_on_off(var);
		} // 크롬 on/off
		else if (var.getMenu_selec().equals("CHROME") || var.getMenu_selec().equals("CH")) {
			sch.chrome_on_off(var);
		} // 전화 걸기
		else if (var.getMenu_selec().equals("CALL") || var.getMenu_selec().equals("CA")) {
			sca.calling(var);
		} // 전화번호부 열기
		else if (var.getMenu_selec().equals("PHONEBOOK") || var.getMenu_selec().equals("PB")) {
			spb.phone_book_open(var);
		} // +나 -를 입력받아 볼륨 컨트롤
		else if (var.getMenu_selec().equals("+") || var.getMenu_selec().equals("-")) {
			sv.vol_change(var);
		} // 스마트폰 종료
		else if (var.getMenu_selec().equals("OFF")) {
			sp.sm_pow_push(var);
		}
	}

	public void sm_now(sm_var var) {
		System.out.println("*****************************************");
		if (var.isYTon()) {
			System.out.println("YouTube	: ON");
		} else
			System.out.println("YouTube	: OFF");
		if (var.isCHon()) {
			System.out.println("Chrome	: ON");
		} else
			System.out.println("Chrome	: OFF");
		System.out.println("Now Vol	: " + var.getVol());
	}

}
