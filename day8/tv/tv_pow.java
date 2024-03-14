package day8;

public class tv_pow {

	public void tv_pow_push(tv_var var) {
		if (var.isTVon() == true) {
			var.setTVon(false);
			System.out.println("전원이 꺼졌습니다.");
		} else {
			var.setTVon(true);
			System.out.println("전원이 켜졌습니다.");
		}
	}
}
