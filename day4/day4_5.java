package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class day4_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. 아메, 2. 라떼, 3. 카푸, 4. 아아, 5. 아라, 6. 아카
		List<Integer> menu = new ArrayList<Integer>(); // 주문한 메뉴를 저장하는 리스트
		String[] m_name = { "아메리카노", "라떼", "카푸치노", "카라멜 마끼아또", "민트초코 프라푸치노" };
		int[] price = { 1000, 1500, 2000, 2500, 3000 };
		int i = 0;
		int result = 0;
		int[] drink = null;
		drink = new int[m_name.length * 2];

		while (true) {
			System.out.println("-----먹고 싶은 메뉴를 고르세요-----");
			System.out.println("1. 아메리카노, 2. 라떼, 3. 카푸치노");
			System.out.println("   1,000원    1500원    2000원");
			System.out.println("4. 카라멜 마끼아또 5. 민트초코 프라푸치노");
			System.out.println("   2500원          3000원");
			System.out.println("그만 고르고 싶으시면 0번을 입력하세요.");
			System.out.println("------------------------------");

			menu.add(sc.nextInt());
			if (menu.get(i) == 0) {
				break;
			} else if (menu.get(i) < 0 || menu.get(i) > m_name.length * 2) {
				System.out.println("잘못된 입력입니다.");
				menu.remove(i);
				i--;
			}
			// ice 메뉴는 menu의 값에 메뉴 개수만큼 더한 값
			System.out.println("1. Hot or 2. Ice? (+500원)");
			int hoe = sc.nextInt();
			if (hoe == 2) {
				menu.set(i, menu.get(i) + m_name.length);
			}
			i++;
		}

		for (i = 0; i < drink.length; i++) {
			drink[i] = Collections.frequency(menu, i + 1);
		}

		for (i = 0; i < m_name.length; i++) {
			if (drink[i] > 0) {
				System.out.println(m_name[i] + " " + drink[i] + "잔 ");
			}
		}

		for (i = m_name.length; i < m_name.length * 2; i++) {
			if (drink[i] > 0) {
				System.out.println("아이스 " + m_name[i - 5] + " " + drink[i] + "잔 ");
			}
		}

		for (i = 0; i < m_name.length; i++) {
			result += drink[i] * price[i];
		}

		for (i = m_name.length; i < m_name.length * 2; i++) {
			result += drink[i] * (price[i - m_name.length] + 500);
		}

		System.out.println("고르셨습니다. ");
		System.out.println("가격은: " + result + "원 입니다.");
		System.out.println("감사합니다.");

	}
}
