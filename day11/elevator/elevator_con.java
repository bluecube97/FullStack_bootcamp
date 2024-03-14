package elevator;

import java.util.Scanner;

public class elevator_con {
	Scanner sc = new Scanner(System.in);

	public void nowstat(ElevatorOne el1, ElevatorTwo el2) {
		int el1_floor = el1.getFloor();
		int el2_floor = el2.getFloor();
		int el1_id = el1.getId();
		int el2_id = el2.getId();
		System.out.println("현재 엘레베이터의 상황입니다.");
		System.out.println(el1_id + "호기는 " + el1_floor + "층에 있습니다.");
		System.out.println(el2_id + "호기는 " + el2_floor + "층에 있습니다.");

	}

	public void input_controll(ElevatorOne el1, ElevatorTwo el2) {
		int sel_elv;
		boolean sel = true;
		System.out.println("이동할 엘레베이터를 선택해주세요.");
		while (sel) {
			sel_elv = sc.nextInt();
			switch (sel_elv) {
			case 1:
				el1.inputFloor();
				sel = false;
				break;
			case 2:
				el2.inputFloor();
				sel = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}

}
