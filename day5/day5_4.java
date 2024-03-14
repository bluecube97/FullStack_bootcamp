package day5;

import java.util.Scanner;

public class day5_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name[] = { "백민", "권상우", "강인서", "백종민", "권혁범", "구은호", "마동석", "박시후", "김도윤", "박지환", "백종헌", "경성환", "김민재",
				"김광석", "박윤희", "고규필", "배지환", "박영준", "박정철", "박지훈", "박선준", "박영운", "서경수", "강상원", "문동혁", "구자성", "박건우", "방일수",
				"강태우", "박지빈", "문지홍", "박유천", "강현중", "문우진", "김상태", "김대건", "서세원", "박지훈", "고진수" };

		System.out.println("검색할 성씨 입력");
		String f_name = sc.next();

		for (int i = 0; i < name.length; i++) {
			if (f_name.equals(name[i].substring(0, 1))) {
				System.out.println(name[i]);
			}
		}
	}
}
