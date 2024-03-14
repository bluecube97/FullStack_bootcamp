package ListTest2;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
//		List<Object>list = new ArrayList<Object>();
//		List<String>list1 = new ArrayList<String>();
//		List<Integer>list2 = new ArrayList<Integer>();
		List<ListBox> list3 = new ArrayList<ListBox>();

		for (int i = 0; i < 5; i++) {
			ListBox lb = new ListBox();
			lb.setUserNo(i);
			lb.setUserId(Integer.toString(i)); // 글자로 0~4
			lb.setUserPw(Integer.toString(i) + Integer.toString(i)); // 글자로 00~44
			
			list3.add(lb);
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(list3.get(i).getUserNo());
			System.out.println(list3.get(i).getUserId());
			System.out.println(list3.get(i).getUserPw());
		}

	}

}
