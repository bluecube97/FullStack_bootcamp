package com.user.VO;

public class UserVO {
	private int USERNO;
	private String USERID;
	private String USERNM;
	private String USERPW;
	private String USERROLE;

	public UserVO() {

	}

	public UserVO(int uSERNO, String uSERID, String uSERNM, String uSERPW, String uSERROLE) {

		USERNO = uSERNO;
		USERID = uSERID;
		USERNM = uSERNM;
		USERPW = uSERPW;
		USERROLE = uSERROLE;
	}

	public int getUSERNO() {
		return USERNO;
	}

	public void setUSERNO(int uSERNO) {
		USERNO = uSERNO;
	}

	public String getUSERID() {
		return USERID;
	}

	public void setUSERID(String uSERID) {
		USERID = uSERID;
	}

	public String getUSERNM() {
		return USERNM;
	}

	public void setUSERNM(String uSERNM) {
		USERNM = uSERNM;
	}

	public String getUSERPW() {
		return USERPW;
	}

	public void setUSERPW(String uSERPW) {
		USERPW = uSERPW;
	}

	public String getUSERROLE() {
		return USERROLE;
	}

	public void setUSERROLE(String uSERROLE) {
		USERROLE = uSERROLE;
	}

}
