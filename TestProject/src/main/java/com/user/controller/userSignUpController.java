package com.user.controller;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reference.config.XmlConfig;
import com.user.dao.userDAO;
import com.user.dao.userDAOImpl;

@WebServlet("/signup")
public class userSignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String ment = (String) req.getAttribute("ment");

		if (ment != null && !ment.isBlank()) {
			req.setAttribute("ment", ment);
		}

		req.getRequestDispatcher("/WEB-INF/com/user/signup.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		XmlConfig.UTFUCK(req, resp);

		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String pw = req.getParameter("pw");
		String pwchk = req.getParameter("pwchk");
		String email = req.getParameter("email");

		System.out.println("id: " + id);
		System.out.println("name: " + name);
		System.out.println("pw: " + pw);
		System.out.println("pwchk: " + pwchk);
		System.out.println("email: " + email);

		String ment = "";
		String result_ment = "";
		
		System.out.println(idChk(id));

		if (idChk(id) == false) {
			System.out.println(idChk(id));
			ment = "ID가 잘못 되었거나, 중복입니다.\\n";
			result_ment += ment;
			req.setAttribute("ment", result_ment);
		}

		if (nameChk(name) == false) {
			ment = "이름은 2자 이상, 10자 이하여야 합니다.\\n";
			result_ment += ment;
			req.setAttribute("ment", result_ment);
		}

		if (pwChk(pw, pwchk) == true) {
			if (pwChk2(pw) == false) {
				ment = "PW 형식이 잘못되었습니다.\\n";
				result_ment += ment;
				req.setAttribute("ment", result_ment);
			}
		} else {
			ment = "PW 와 PW확인이 다릅니다.\\n";
			result_ment += ment;
			req.setAttribute("ment", result_ment);
		}
		
		System.out.println("result_ment : " + result_ment);
		
		doGet(req, resp);

		mailChk(email);

	}

	private boolean pwChk2(String pw) {
		Pattern pat = Pattern.compile("^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,20}$");
		Matcher mpw = pat.matcher(pw);

		if (mpw.find()) {
			return true;
		}

		return false;
	}

	private boolean mailChk(String email) {

		return false;
	}

	private boolean pwChk(String pw, String pwchk) {
		if (!pw.equals(pwchk)) {
			return false;
		}

		return true;
	}

	private boolean nameChk(String name) {
		if (name.length() >= 10 || name.length() < 1) {
			return false;
		} else {
			return true;
		}
	}

	private boolean idChk(String id) {
		userDAO ud = new userDAOImpl();

		return ud.IdCheck(id);
	}
}
