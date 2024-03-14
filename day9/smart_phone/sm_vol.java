package smart_phone;

public class sm_vol {

	public void vol_change(sm_var var) {
		if (var.getMenu_selec().equals("+")) {
			var.setVol(var.getVol() + 1);
		} else if (var.getMenu_selec().equals("-")) {
			var.setVol(var.getVol() - 1);
		}

	}

}
