package day8;

import java.util.Scanner;

public class tv_controll {
	Scanner sc = new Scanner(System.in);

	tv_var var = new tv_var();
	tv_pow tp = new tv_pow();
	tv_vol tv = new tv_vol();
	tv_ch tc = new tv_ch();

	public void tv_con() {
		while (true) {
			System.out.println("전원 버튼 누르기(아무거나 입력하세요.)");
			sc.next();
			tp.tv_pow_push(var); // 버튼 누름 true면 false false면 true로 전환

			while (var.isTVon()) {
				System.out.println("채널을 이동하려면 < >");
				System.out.println("볼륨을 조정하려면 - +");
				System.out.println("을 입력하세요    감 증");
				System.out.println("전원을 종료하려면 off를 입력하세요.");

				var.setChvl(sc.next());
				tc.channl_change(var, tp);
				tv.vol_change(var);

				if (!var.getChvl().equals("off")) {
					System.out.println("CH:	" + var.getCh());
					System.out.println("Vol:	" + var.getVol());
				}
			}
		}
	}
}
