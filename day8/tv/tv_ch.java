package day8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tv_ch {

	public void channl_change(tv_var var, tv_pow tp) {
		String patternStr = "^\\d+$";
		Pattern pt = Pattern.compile(patternStr);
		Matcher ma = pt.matcher(var.getChvl());

		if (var.getChvl().equals("<")) { // 채널 감소
			var.setCh(var.getCh() - 1);
		} else if (var.getChvl().equals(">")) { // 채널 증가
			var.setCh(var.getCh() + 1);
		} else if (var.getChvl().equals("off")) {
			tp.tv_pow_push(var);
		} else if (ma.find()) { // 수를 입력받으면
			var.setCh(Integer.valueOf(var.getChvl()));
		} else if (var.getChvl().equals("+") || var.getChvl().equals("-")) {
			
		} else {
			System.out.println("Wrong Input!!");
		}
	}
}
