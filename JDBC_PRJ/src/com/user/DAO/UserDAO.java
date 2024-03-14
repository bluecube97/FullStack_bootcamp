package com.user.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.user.VO.UserVO;

public class UserDAO {

	public UserVO[] getUserInfo(int i) {

		UserVO[] ua = new UserVO[i];
		try {
			String url = "jdbc:mysql://localhost:3306/testDB?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String id = "root";
			String pw = "1234";
			String driver = "com.mysql.jdbc.Driver";
			Connection con = DriverManager.getConnection(url, id, pw);
			Statement st = con.createStatement();
			ResultSet rs = null;

			String sql = " select USERNO, USERID, USERNM, USERPW, USERROLE "
			           + " FROM com_user "
			  		   + " limit " + i;

			rs = st.executeQuery(sql);
			int cnt = 0;

			while (rs.next()) {
				int userNo = rs.getInt("USERNO");
				String userId = rs.getString("USERNM");
				String userNm = rs.getString("USERNM");
				String userPw = rs.getString("USERPW");
				String userRole = rs.getString("USERROLE");

				UserVO uv = new UserVO(userNo, userId, userNm, userPw, userRole);
				ua[cnt] = uv;
				cnt++;
				
				if(cnt == 5) {
					break;
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return ua;
	}
}
