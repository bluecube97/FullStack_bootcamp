package elevator;

import java.util.Scanner;

public class Elevator {
	Scanner sc = new Scanner(System.in);
	private int floor;
	private int id;
	
	public Elevator(int id) {
		this.floor = 1;   //1층으로 초기화
		this.id = id;
	}
	
	public void inputFloor() {
		int gotoFloor;
		System.out.println(this.id + "호기를 선택하셨습니다.\n이동하실 층을 선택해주세요.");
		gotoFloor = sc.nextInt();
		upDownFloor(gotoFloor);
		this.floor = gotoFloor;
	}
	
	public void upDownFloor(int targetFloor) {
		System.out.println("Elevator" + id + "호기가 " + floor + "층에서 " + targetFloor + "층으로 이동합니다.") ;
		this.floor = targetFloor;
	}
	
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}