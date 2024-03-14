package day5;

public class day5_3 {

	public static void main(String[] args) {
		String tel_num[] = { "010-1234-5678", "010-1111-2222", "010-3333-4444", "010-5555-6666" };
		//tel_num 크기만큼 배열동적할당
		String tel_head[] = new String[tel_num.length];
		
		//tel_num 크기 만큼 for 문이 loop함
		for (int i = 0; i < tel_num.length; i++) {
			//문자열 tel_h 에 tel_num(전화번호) 0~3 목록 입력
			String tel_h = tel_num[i];
			//tel_h 에 입력되어 있는 tel_num[0]~[3] 까지 데이터를 split을 이용하여 '-' 제거하여 배열 for_tel[] 저장
			String for_tel[] = tel_h.split("-");
			//'-' 제거 된 for_tel[0] 번째 값(010)을 tel_head[0] ~ tel_head[3] 배열에 입력함
			tel_head[i] = for_tel[0];
		}
		
		for(int i = 0; i < tel_head.length; i++) {
			System.out.println(tel_head[i]);
		}

	}

}
