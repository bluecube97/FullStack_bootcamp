package day6;

import java.util.ArrayList;
import java.util.List;

public class day6_1 {

	public static void main(String[] args) {

		int number = 10;
		n1(number);
		String str = "안녕";
		n2(str);
		int number_arr[] = { 1, 2, 3, 4, 5 };
		n3(number_arr);
		String lang[] = { "english", "spanish", "japanes", "korean", "english", "english", "spanish", "korean",
				"chinese", "chinese", "english" };
		n4(lang);
		List<String> list = new ArrayList<String>();
		n5(list);
		UserVO uv = new UserVO();
		n6(uv);

	}

	static void n1(int i) {
		i = 1 + 1;
	}

	static void n2(String str) {
		System.out.println(str);
	}

	static void n3(int[] a) {
	}

	static void n4(String[] a) {
	}

	static void n5(List<String> list) {
	}

	static void n6(UserVO uv) {
	}
}
