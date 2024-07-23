package com.ict.day03;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		try (// 키보드 입력 받아서 문제 해결
		Scanner scan = new Scanner(System.in)) {
			// 학점 A, B, F
			System.out.print("점수입력: ");
			int su = scan.nextInt();
			String re = su >= 80 ? (su >= 90 ? "A학점" : "B학점") : "F학점";
			System.out.println(re);
			// 1,3 = 남자 2,4 = 여자, 나머지=외국인
			System.out.print("주민번호 뒤에 첫번째 자리 수 입력: ");
			su=scan.nextInt();
			re=su==1||su==3?"남자":(su==2||su==4?"여자":"외국인");
			System.out.println(re);

			// 두 수 받아서 큰 수 출력
			System.out.print("첫번째 수: ");
			int su2=scan.nextInt();
			System.out.print("두번째 수: ");
			int su3=scan.nextInt();
			re=(su2>su3)?"큰 수는 "+su2+"입니다":"큰 수는 "+su3+"입니다";
			System.out.println(re);
		}
		
		

	}
}
