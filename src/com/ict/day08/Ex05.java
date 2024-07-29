package com.ict.day08;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			// 학생수
			System.out.print("학생 수: ");
			int cnt = scan.nextInt();
			scan.nextLine();
			String[][] arr = new String[cnt][8];
			// 1명의 모든 정보가 들어간다. (이름은 String이라 못 들어감)
			// [ 번호, 국어, 수학, 영어, 총점, 평균, 학점, 순위]
			double[] p1 = { 1, 90, 90, 90, 270, 90, 'A', 1 };

			// 5명의 1차적 배열
			for (int i = 0; i < arr.length; i++) {

				// 한 사람의 정보를 담는 배열을 만들자
				String[] p = new String[8];

				System.out.print("\n이름: ");
				p[0] = scan.nextLine();
				System.out.print("국어: ");
				p[1] = scan.nextLine();
				System.out.print("수학: ");
				p[2] = scan.nextLine();
				System.out.print("영어: ");
				p[3] = scan.nextLine();

				p[4] = String.valueOf(Integer.parseInt(p[1]) + Integer.parseInt(p[2]) + Integer.parseInt(p[3]));
				p[5] = String.valueOf((int) (Integer.parseInt(p[4]) / 3.0 * 100) / 100.0);

				// 학점
				if (Double.parseDouble(p[5]) >= 90) {
					p[6] = String.valueOf('A');
				} else if (Double.parseDouble(p[5]) >= 80) {
					p[6] = String.valueOf('B');
				} else if (Double.parseDouble(p[5]) >= 70) {
					p[6] = String.valueOf('C');
				} else {
					p[6] = String.valueOf('F');
				}
				// 순위
				p[7] = String.valueOf(1);
				// 8개의 인덱스를 가진 2차적 배열
				arr[i] = p;
			}

			// 총점 기준으로 순위 설정
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (Integer.parseInt(arr[i][4]) < Integer.parseInt(arr[j][4]))
						arr[i][7] = String.valueOf(Integer.parseInt(arr[i][7]) + 1);
				}
			}

			// 정렬
			String[] tmp = new String[8]; // 빈 더블형 배열 생성하기
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (Integer.parseInt(arr[i][7]) > Integer.parseInt(arr[j][7])) {
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}

			System.out.println();
			// [ 번호, 국어, 수학, 영어, 총점, 평균, 학점, 순위]
			System.out.println("이름\t국어\t수학\t영어\t총점\t평균\t학점\t순위");
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
		}

	}
}
