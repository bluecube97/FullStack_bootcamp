package day10;

public class UserCheck {

	public boolean userCheck(UserInfo ui) {
		if (ui.userId.equals("java") && ui.userPw.equals("1111") && ui.oper.equals("+")) {
			return true;
		} else {
			return false;
		}
	}
}
