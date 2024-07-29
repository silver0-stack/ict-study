package com.ict.day11;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int cnt = scan.nextInt();
			scan.nextLine();

			String name = "";
			int kor = 0;
			int eng = 0;
			int math = 0;

			// Ex07로 만들어진 클래스의 모임
			Ex07[] arr = new Ex07[cnt];
			for (int i = 0; i < arr.length; i++) {
				System.out.print("\n이름: ");
				name = scan.nextLine();
				System.out.print("국어: ");
				kor = scan.nextInt();
				System.out.print("영어: ");
				eng = scan.nextInt();
				System.out.print("수학: ");
				math = scan.nextInt();
				scan.nextLine();
				Ex07 ex = new Ex07(name, kor, eng, math);
				arr[i] = ex;
			}

			System.out.println();

			System.out.println("순위 설정 전 >> ");

			// arr 출력
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);

			}

			// 총점을 기준으로 순위 설정
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i].getSum() < arr[j].getSum()) {
						// 변경할 랭크 = 내 랭크 + 1
						int rank = arr[i].getRank();
						// 랭크 + 1 을 set 하기
						arr[i].setRank(rank + 1);
					}
				}

			}

			// 순위 설정 후 출력
			System.out.println("\n순위 설정 후 >> ");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);

			}

			// 순위를 기준으로 정렬
			Ex07 tmp = new Ex07();
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 1; j < arr.length; j++) {
					if (arr[i].getRank() > arr[j].getRank()) {
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}

				}

			}

			// 정렬 후 출
			System.out.println("\n순위 정렬 후 >> ");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);

			}

		}

	}
}
