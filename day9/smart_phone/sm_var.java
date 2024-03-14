package smart_phone;

public class sm_var {
	private boolean SMon = false; // 스마트폰 전원
	private boolean YTon = false; // 유튜브 켜짐/꺼짐 여부
	private boolean CHon = false; // 크롬 켜짐/꺼짐 여부
	private String menu_selec; // 메뉴 선택 입력받는 변수
	private int PBon = 0;

	private String[] phone_book = new String[10];

	private int vol = 5; // 볼륨 초기값
	private String tel_num = ""; // 전화번호 입력받는 변수

	public sm_var() {

	}

	public sm_var(boolean sMon, boolean yTon, boolean cHon, String menu_selec, int PBon, int vol, String tel_num,
			String[] phone_book) {
		SMon = sMon;
		YTon = yTon;
		CHon = cHon;
		this.menu_selec = menu_selec;
		this.PBon = PBon;
		this.vol = vol;
		this.tel_num = tel_num;
		this.phone_book = phone_book;
	}

	public boolean isSMon() {
		return SMon;
	}

	public void setSMon(boolean sMon) {
		SMon = sMon;
	}

	public String getMenu_selec() {
		return menu_selec;
	}

	public void setMenu_selec(String menu_selec) {
		this.menu_selec = menu_selec;
	}

	public int getPBon() {
		return PBon;
	}

	public void setPBon(int pBon) {
		PBon = pBon;
	}

	public boolean isYTon() {
		return YTon;
	}

	public void setYTon(boolean yTon) {
		YTon = yTon;
	}

	public boolean isCHon() {
		return CHon;
	}

	public void setCHon(boolean cHon) {
		CHon = cHon;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public String getTel_num() {
		return tel_num;
	}

	public void setTel_num(String tel_num) {
		this.tel_num = tel_num;
	}

	public String[] getPhone_book() {
		return phone_book;
	}

	public void setPhone_book(String[] phone_book) {
		this.phone_book = phone_book;
	}

}
