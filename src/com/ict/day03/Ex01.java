package com.ict.day03;

public class Ex01 {

	public static void main(String[] args) {
		// || (OR, 논리합, 합집합)
		// 주어진 조건들 중 하나라도 TRUE가 있으면 결과는 TRUE
		// TRUE를 만나면 다음 연산은 안함

		int su1 = 10;
		int su2 = 7;
		boolean res;

		res = (su1 >= 7) || (su2 >= 5);
		System.out.println("결과: " + res);

		res = (su1 <= 7) || (su2 >= 5);
		System.out.println("결과: " + res);

		res = (su1 <= 7) || (su2 <= 5);
		System.out.println("결과: " + res);

		// or은 true를 만나면 결과가 true이므로 이후 연산을 하지 않는다
		su1 = 10;
		su2 = 7;
		res = ((su1 += 2) > su2) || (su2 == (su2 + 5));
		System.out.println("결과: " + res);
		System.out.println("su2: " + su2); // 앞의 연산이 true이므로 su2 연산 안함
		System.out.println();

		// NOT(!, 논리부정)
		// 주어진 논리값을 반대로 출력
		// TRUE -> FALSE, FALSE->TRUE

		res=true;
		System.out.println(!res); // false
		System.out.println(!!res); // true
		System.out.println(!!!res); // false
	}

}
