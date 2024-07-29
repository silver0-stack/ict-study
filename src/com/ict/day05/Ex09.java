package com.ict.day05;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			// 2를 누르면 전체를 빠져나가는 라벨
			exit: while (true) {
				System.out.println("\n===========GAME START!===========");
				System.out.print("숫자 입력: ");
				int su = scan.nextInt();
				String res = "";
				if (su % 2 == 0) {
					res = "짝수";
				} else {
					res = "홀수";
				}

				System.out.println(su + "는 " + res + " 입니다.");

				while (true) {
					System.out.print("\n계속할까요?(1. yes 2. no) >> ");
					int result = scan.nextInt();
					if (result == 1)
						continue exit; // 다시 exit while 문 시작
					else if (result == 2) {
						System.out.println("\n게임을 종료합니다.");
						break exit; // exit while문 탈출
					} else {
						System.out.println("\n1과 2의 선택지 중 선택해주세요!");
						continue; // 다시 물어봄
					}
				}

			}
		} 
	}
}
