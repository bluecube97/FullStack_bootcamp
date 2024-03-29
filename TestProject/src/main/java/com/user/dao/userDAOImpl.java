package com.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.reference.connection.JDBCUtill;
import com.reference.connection.connectionProvider;
import com.user.vo.userVO;

public class userDAOImpl implements userDAO {
	Connection con = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	@Override
	public userVO getLoginCheck(userVO uv) {
		userVO uvo = null;

		String sql = " SELECT cu.USERNO as userno, cu.USERID as userid, "
				+ "	cu.USERNM as usernm, "
				+ " (CASE "
				+ " WHEN cu.USERROLE = 'A' "
				+ "	THEN '관리자' "
				+ " WHEN cu.USERROLE = 'U' "
				+ "	THEN '사용자' "
				+ " END)AS userrole, "
				+ " (CASE "
				+ " WHEN cu.DEPTNO = 1 "
				+ " THEN '사장실' "
				+ " WHEN cu.DEPTNO = 2 "
				+ " THEN '인사팀' "
				+ " WHEN cu.DEPTNO = 3 "
				+ " THEN '영업1팀' "
				+ " WHEN cu.DEPTNO = 4 "
				+ " THEN '영업2팀' "
				+ " WHEN cu.DEPTNO = 5 "
				+ " THEN '개발팀' "
				+ " WHEN cu.DEPTNO = 6 "
				+ " THEN '자재팀' "
				+ " END) as userdept, "
				+ " cu.USEREMAIL as useremail "
				+ " FROM COM_USER cu "
				+ " where cu.USERID = ? "
				+ " and cu.USERPW = ? "
				+ " LIMIT 1 ";
		
		try {
			con = connectionProvider.getConnection();
			psmt = con.prepareStatement(sql);
			
			String id = uv.getUserId();
			String pw = uv.getUserPw();
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				int userNo = rs.getInt("userno");
				String userId = rs.getString("userid");
				String userNm = rs.getString("usernm");
				String userDept = rs.getString("userdept");
				String userRole = rs.getString("userrole");
				String userEmail = rs.getString("useremail");
								
				uvo = new userVO(userNo, userId, userNm, userDept, userRole, userEmail);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtill.close(con);
			JDBCUtill.close(psmt);
			JDBCUtill.close(rs);
		}

		return uvo;
	}

	@Override
	public List<userVO> getUserList(String skey, String addSql, int page) {
		List<userVO> list = new ArrayList<>();
		
		String sql = " select cu.USERNO as userno, cu.USERNM as usernm, cu.USERID as userid, "
				   + " (CASE "
				   + "      WHEN cu.USERROLE = 'A' "
				   + " THEN '관리자' "
				   + "      WHEN cu.USERROLE = 'U' "
				   + " THEN '사용자' "
				   + "      END) AS userrole "
				   + " from COM_USER cu " ;
		
		try {
			int start_page = ((page - 1) * 10);
			String pageSql = " LIMIT " + start_page + ", " + 10;
			sql = sql + addSql + pageSql; 
			
			con = connectionProvider.getConnection();
			psmt = con.prepareStatement(sql);
			
			psmt.setString(1, "%" + skey + "%");
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				int userNo = rs.getInt("userno");
				String userNm = rs.getString("usernm");
				String userRole = rs.getString("userrole");
				
				userVO uv = new userVO(userNo, userNm, userRole);
				list.add(uv);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtill.close(con);
			JDBCUtill.close(psmt);
			JDBCUtill.close(rs);
		}
		
		return list;
	}

	@Override
	public int getBoardCount(String skey, String addSql) {
		int count = 0;
		String sql = " SELECT COUNT(*) AS CNT "
				   + " from COM_USER cu ";
		
		try {
			sql = sql + addSql;
			
			con = connectionProvider.getConnection();
			psmt = con.prepareStatement(sql);
			psmt.setString(1, "%" + skey + "%");
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				count = rs.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtill.close(con);
			JDBCUtill.close(psmt);
			JDBCUtill.close(rs);
		}
		
		return count;
	}

	@Override
	public boolean IdCheck(String id) {
		String sql = " SELECT count(USERID) as cnt "
				+ " FROM com_user "
				+ " WHERE USERID = ? ";
		boolean result = false;
		
		try {
			con = connectionProvider.getConnection();
			psmt = con.prepareStatement(sql);
					
			psmt.setString(1, id);
			
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				int cnt = rs.getInt("cnt");
				
				if (cnt == 0) {
					result = true;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtill.close(con);
			JDBCUtill.close(psmt);
			JDBCUtill.close(rs);
		}

		return result;
	}

}
