package smart_phone;

public class sm_ch {

	public void chrome_on_off(sm_var var) {
		if (var.isCHon() == true) {
			var.setCHon(false);
			System.out.println("크롬이 꺼졌습니다.");
		} else {
			var.setCHon(true);
			System.out.println("크롬이 켜졌습니다.");
		}
		
	}

}
