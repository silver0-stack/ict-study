package com.ict.day03;

public class Ex08 {

	public static void main(String[] args) {
		// 중첩삼항연산자: 삼항 연산자 안에 삼항 연산자가 존재
		// 형식) 자료형 변수 = (조건식1)? (조건식2? 참일때 : 거짓일때) : 거짓일때 ;

		// 90 이상이면 a학점 80 이상이면 b학점 나머지면 f학점
		int k1 = 79;
		String res = (k1 >= 80) ? (k1 >= 90 ? "A학점" : "B학점") : "F학점";
		System.out.println(res);

		// char k2가 대문자인지 소문자인지 기타문자인지 판별
		char k2 = '/';
		res = (k2 >= 'a' && k2 <= 'z') ? "소문자" : (k2 >= 'A' && k2 <= 'Z' ? "대문자" : "기타문자");
		System.out.println(res);

		// k3가 1 또는 3이면 남자, 2 또는 4이면 여자, 나머지는 외국인
		int k3 = 5;
		res = (k3 == 1 || k3 == 3) ? "남자" : (k3 == 2 || k3 == 4 ? "여자" : "외국인");
		System.out.println(res);

		// 두 수 중 큰 수를 구하자
		int su1 = 4;
		int su2 = 9;
		int re = su1 > su2 ? su1 : su2;
		System.out.println(re);
		
		int su4=Math.max(su1,su2);
		System.out.println(su1+"과 "+su2+" 중 "+su4+"가 크다.");

	}

}
