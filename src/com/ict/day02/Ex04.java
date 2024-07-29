package com.ict.day02;

public class Ex04 {
	public static void main(String[] args) {
		// 기본자료형은 아니지만 기본자료형처럼 사용하는 String
		// String 클래스는 기본자료형이 아니라 클래스이므로 참조자료형
		// 사용법이 기본자료형처럼 사용가능하다
		// 반드시 쌍따옴표를 사용한다("가")
		
		String str="링고스타";
		System.out.println(str);
		
		String s1="10";
		int s2=10;
		
		// s1이 문자열이므로 실제 덧셈이 되는게 아니라 문자와 숫자를 연결
		// 값의 타입이 String
		System.out.println(s1+10); // 1010
		// s2가 숫자이므로 실제 계산이 된다.
		System.out.println(s2+10); // 20
		
		// 문자와 숫자의 연산이 함께 출력되면 결과물의 타입이 String이 된다
		// 괄호먼저 하면 합계가 제대로 됨
		System.out.println("합계: "+(20+4));
		
		// 하지만 이게 더 옳은 솔루션: 합계 변수를 선언 후에 가져다 쓰는게 활용도가 높음
		int sum=20+4;
		System.out.println("합계: "+sum);
		
	}
}
