package com.user;

import com.user.DAO.UserDAO;
import com.user.VO.UserVO;

public class program {

	public static void main(String[] args) {
		UserDAO ud = new UserDAO(); // UserVO 형 5개짜리 객체 생성
		UserVO[] ua = new UserVO[5]; // DB 접속과 실행을 위한 DAO 객체 생성
		ua = ud.getUserInfo(5); // DAO 의 getUserInfo 에 배열 값 5를 보냄

		System.out.println("****************************************");
		for (UserVO uv : ua) {
			int userNo = uv.getUSERNO();
			String userId = uv.getUSERID();
			String userNm = uv.getUSERNM();
			String userPw = uv.getUSERPW();
			String userRole = uv.getUSERROLE();
			System.out.printf("| %d | %s | %s | %s | %s |\n", userNo, userId, userNm, userPw, userRole);
		}
		System.out.println("****************************************");
	}

}
