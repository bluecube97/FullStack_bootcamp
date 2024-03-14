package day7;

import java.util.Scanner;

public class day7_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s_arr = null;
		s_arr = new String[10];
		
		for (int i = 0; i < s_arr.length; i++) {
			System.out.println("글자를 입력하세요.");
			System.out.println("그만 입력하시려면 stop!!을 입력하세요.");
			s_arr[i] = sc.next();

			if (s_arr[i].equals("stop!!")) {
				s_arr[i] = null;
				break;
			}
		}

		output(s_arr);

	}

	public static void output(String[] s_arr) {
		for (int i = 0; i < s_arr.length; i++) {
			System.out.println(s_arr[i]);
		}
		System.out.println("--------------------");

		for (int i = 0; i < s_arr.length; i++) {
			if (s_arr[i] == null) {
				System.out.println(i);
				break;
			} else {
				System.out.println(s_arr[i]);
			}
		}
	}

}
