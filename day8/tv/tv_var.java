package day8;

public class tv_var {
	private boolean TVon = false;
	private String chvl; // 채널볼륨

	int ch = 11;
	int vol = 10;

	public tv_var() {

	}

	public tv_var(boolean tVon, String chvl, int ch, int vol) {
		this.TVon = tVon;
		this.chvl = chvl;
		this.ch = ch;
		this.vol = vol;
	}

	public boolean isTVon() {
		return TVon;
	}

	public void setTVon(boolean tVon) {
		this.TVon = tVon;
	}

	public String getChvl() {
		return chvl;
	}

	public void setChvl(String chvl) {
		this.chvl = chvl;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

}
