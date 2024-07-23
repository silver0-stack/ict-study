package com.ict.day03;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			// 1. 숫자를 받아서 해당 숫자가 홀짝 판별
			System.out.print("숫자 입력: ");
			int n1 = scan.nextInt();
			String res = n1 % 2 == 0 ? "짝수입니다." : "홀수입니다";
			System.out.println(res);
			System.out.println();
			
			// 2. 점수를 받아서 해당 점수가 80점 이상이면 합격 아니면 불합격
			System.out.print("점수 입력: ");
			n1 = scan.nextInt();
			res = n1 >= 80 ? "합격" : "불합격";
			System.out.println(res);
			System.out.println();
			
			// 3. 근무시간을 받아서 8시간 이상이면 8시간 까지는 9869이고
			// 8시간을 초과한 시간에 대해서는 1.5배를 추가로 지급한다.
			System.out.print("근무시간: ");
			
			n1 = scan.nextInt();
			int dan = 9860;
			int h = 8;
			int res2 = n1 > 8 ? (int) (dan * h + (n1 - 8) * dan * 1.5) : dan * h;
			System.out.println(res2);
		}
	}
}
