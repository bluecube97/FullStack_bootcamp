package smart_phone;

public class sm_pow {

	public void sm_pow_push(sm_var var) {
		if (var.isSMon() == true) {
			var.setSMon(false);
			System.out.println("전원이 꺼졌습니다.");
		} else {
			var.setSMon(true);
			System.out.println("전원이 켜졌습니다.");
		}
	}
}
