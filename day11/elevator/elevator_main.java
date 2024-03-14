package elevator;

public class elevator_main {

	public static void main(String[] args) {
		elevator_con elc = new elevator_con();
		ElevatorOne el1 = new ElevatorOne();
		ElevatorTwo el2 = new ElevatorTwo();

		while (true) {
			elc.nowstat(el1, el2);
			elc.input_controll(el1, el2);
		}
	}

}
