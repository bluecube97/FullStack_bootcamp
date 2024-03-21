package day15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MainVO mv = new MainVO();

        System.out.println("페이지 묶음의 개수를 입력하세요.");
        mv.setSize(sc.nextInt());

        int[] input = new int[mv.getSize()];
        mv.setInput(input);

        for (int i = 0; i < mv.getSize(); i++) {
            mv.getInput()[i] = i + 1;
        }

        mv.setInput(input);

        for (int i = 0; i < mv.getSize(); i++) {
            mv.setStart_page(mv.getInput()[i] * 10 - 10);
            mv.setEnd_page(mv.getInput()[i] * 10 - 1);
            System.out.println("input value: " + mv.getInput()[i]);
            System.out.println(mv.getStart_page() + ", " + mv.getEnd_page());
        }
    }
}
