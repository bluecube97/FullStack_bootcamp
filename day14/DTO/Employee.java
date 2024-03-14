package DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Comparable<Employee> {
	private int sabun;
	private String name;
	@Override
	public int compareTo(Employee o) {
		
		// 기준 타입이 숫자일 경우
		// return this.sabun - o.sabun;	// 오름차순
		// return o.sabun - this.sabun;	// 내림차순
		
		// 기준 타입이 문자일 경우
		return o.name.compareTo(this.name);
	}

}
