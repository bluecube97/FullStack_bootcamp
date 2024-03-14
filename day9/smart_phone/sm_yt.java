package smart_phone;

public class sm_yt {

	public void youtube_on_off(sm_var var) {
		if (var.isYTon() == true) {
			var.setYTon(false);
			System.out.println("유튜브가 꺼졌습니다.");
		} else {
			var.setYTon(true);
			System.out.println("유튜브가 켜졌습니다.");
		}
		
	}

}
