package com.ict.day03;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// 삼항연산자: 조건이 참일 때와 거짓일 때를 구분해서 실행한다.
		// 자료형 변수 = 조건식 ? 참일때 실행 : 거짓일때 실행

		// *** 변수, 참일때 실행결과, 거짓일때 실행결과 모두 같은 자료형이여야 함***

		// int k1이 홀인지 짝인지 판별하자
		Scanner scan = new Scanner(System.in);
		System.out.print("정수: ");
		int n = scan.nextInt();
		scan.close();
		String str = n % 2 == 0 ? "짝수입니다" : "홀수입니다";
		System.out.println(str);

		int k = 1;
		int price = 1300;
		int res = (k == 1) ? (int) (price * 0.9) : price;
		System.out.println(res);

		char k4 = 'G';
		str = (k4 >= 'A' && k4 <= 'Z') ? "대문자" : "대문자 아님";
		System.out.println(str);

		// 근무시간이 8시간까지는 시간당 9860 이다
		// 8시간 초과하면 초과한 시간만큼 1.5배 지금한다
		// 현재 근무시간이 10시간이면 얼마를 받아야할까
		int time = 10;
		int dan = 9860;
		int res2 = time - 8 > 0 ? (int)(dan * 8 + dan * 1.5 * 2) : dan * time;
		System.out.println(res2);

	}
}
