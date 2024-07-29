package com.ict.day02;

public class Ex06 {
	public static void main(String[] args) {
		// 국어 90, 영어 80, 수학 80
		// 총점과 평균
		// 이름 총점 평균만 출력(단, 평균은 소수점 둘째자리까지)

		int kor=90;int eng=80;int math=80;
		
		int sum = kor+eng+math;
		double avr = sum / 3.0; // 83.33333
		double avr2 = (int) (avr * 100) / 100.0;

		System.out.println(avr);
		System.out.println("이름: " + "링고, 총점: " + sum + ", 평균: " + avr2);

	}
}
