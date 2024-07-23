package com.ict.day02;

public class Ex10 {
	public static void main(String[] args) {
		// 증감연산자: 1을 증가시키거나 감소시키는 연산자
		// ++(--) 변수 : 현재 변수가 가지고 있는 값을 1 증가 시키고 나머지 실행
		// 변수 ++(--): 현재 변수를 가지고 실행 후 맨 마지막에 1 증가(감소)한다
		
		int su=4;
		int result=++su*4;
		System.out.println(result);
		System.out.println(su);
		
		int su2=4;
		int result2=su2++*4;
		System.out.println(result2);
		System.out.println(su2);
		
	}
}
