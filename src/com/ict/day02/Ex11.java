package com.ict.day02;

public class Ex11 {
	public static void main(String[] args) {
		//비교연산자 대상: 문자형, 정수형, 실수형
		//비교연산자 결과 : 무조건 boolean 형(논리형)
		// 논리형은 기본적으로 조건식에 사용된다.
		
		int su1=90;
		int su2=80;
		boolean result=su1<su2;
		System.out.println("결과: "+result);
		
		char su5='a';
		// char을 int의 강제형변경하면 알 수 있다.
		System.out.println("a: "+(int)su5);
		                                                                                                                                                                                                                                                                                                                                                                      
	}
}
