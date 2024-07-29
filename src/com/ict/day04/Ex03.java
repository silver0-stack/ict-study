package com.ict.day04;

public class Ex03 {
	public static void main(String[] args) {
		// switch ~ case: 다중 if문과 같은 조건문
		// if문은 조건식 boolean 형일 때 사용
		// switch문은 인자값이 int, char, string 일때 사용한다.
		// 숫자라도 long, float, double은 사용불가!!

		/*
		 * 주의사항 break는 현재 실행 중인 범위 {} 블록을 벗어나는 역할이다. break가 없으면 break 만날 때까지(무한) 남은 케이스
		 * 실행문들을 실행한다. 없으면 안됨. default 빼고
		 */

		// int k1 이 1이면 카페모카 2이면 카페라떼 3이면 아메 4이면 과일쥬스
		int k1 = 3;
		switch (k1) {
		case 1:
			System.out.println("카페모카");
			break;
		case 2:
			System.out.println("카페라떼");
			break;
		case 3:
			System.out.println("아메리카노");
			break;
		case 4:
			System.out.println("과일쥬스");
			break;
		default:
		}
		System.out.println("수고했다잉");

		char k2 = 'B';
		String str = "";

		switch (k2) {
		case 'A':
			str = "아프리카";
			break;
		case 'B':
			str = "브라질";
			break;
		case 'C':
			str = "캐나다";
			break;
		default:
			str = "한국";
		}
		System.out.println(str);
		
		
		String k4= "한국";
		String result="";
		
		switch(k4) {
		case "한국":
			result="서울";
			break;
		case "중국":
			result="베이징";
			break;
		case "일본":
			result="도쿄";
			break;
		case "미국":
			result="워싱턴";
			break;
		default:
		}
		System.out.println(result);
	}
}
