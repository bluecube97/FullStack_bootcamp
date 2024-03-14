package day10_1;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		calcVar cv = new calcVar();

		System.out.println("1st Input");
		cv.setNum1(sc.nextInt());
		System.out.println("2nd Input");
		cv.setNum2(sc.nextInt());
		System.out.println("Oper");
		cv.setOper(sc.next());

		System.out.println("Ouput");
		if (cv.getOper().equals("+")) {
			cv.setNum3(cv.getNum1() + cv.getNum2());
			System.out.println((int)cv.getNum3());
		} else if (cv.getOper().equals("-")) {
			cv.setNum3(cv.getNum1() - cv.getNum2());
			System.out.println((int)cv.getNum3());
		} else if (cv.getOper().equals("*")) {
			cv.setNum3(cv.getNum1() * cv.getNum2());
			System.out.println((int)cv.getNum3());
		} else if (cv.getOper().equals("/")) {
			cv.setNum3(cv.getNum1() / cv.getNum2());
			System.out.println(cv.getNum3());
		} else {
			System.out.println("Wrong Input!!");
		}

	}
}
