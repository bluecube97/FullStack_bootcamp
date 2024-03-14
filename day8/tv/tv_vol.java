package day8;

public class tv_vol {

	public void vol_change(tv_var var) {
		if (var.getChvl().equals("+")) {
			var.setVol(var.getVol() + 1);
		} else if (var.getChvl().equals("-")) {
			var.setVol(var.getVol() - 1);
		}
	}
}
