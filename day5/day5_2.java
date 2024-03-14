package day5;

public class day5_2 {
	public static void main(String[] args) {
		String str = " 가 나다라마바사 ";
		String t_str = str.trim();
		String r_str = str.replace(" ", "");
		
		System.out.println(t_str);
		System.out.println(r_str);
		
		System.out.println(r_str.substring(2));
		System.out.println(r_str.substring(1, 3));
		
	}
}
