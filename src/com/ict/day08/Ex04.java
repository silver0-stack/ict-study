package com.ict.day08;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			// 학생수
			System.out.print("학생 수: ");
			int cnt = scan.nextInt();
			double[][] arr = new double[cnt][8];
			// 1명의 모든 정보가 들어간다. (이름은 String이라 못 들어감)
			// [ 번호, 국어, 수학, 영어, 총점, 평균, 학점, 순위]
			double[] p1 = { 1, 90, 90, 90, 270, 90, 'A', 1 };

			// 5명의 1차적 배열
			for (int i = 0; i < arr.length; i++) {

				// 한 사람의 정보를 담는 배열을 만들자
				double[] p = new double[8];

				System.out.print("\n번호: ");
				p[0] = scan.nextInt();
				System.out.print("국어: ");
				p[1] = scan.nextInt();
				System.out.print("수학: ");
				p[2] = scan.nextInt();
				System.out.print("영어: ");
				p[3] = scan.nextInt();

				p[4] = p[1] + p[2] + p[3];
				p[5] = (int) (p[4] / 3.0 * 100) / 100.0;

				// 학점
				if (p[5] >= 90) {
					p[6] = 'A';
				} else if (p[5] >= 80) {
					p[6] = 'B';
				} else if (p[5] >= 70) {
					p[6] = 'C';
				} else {
					p[6] = 'F';
				}
				// 순위
				p[7] = 1;
				// 8개의 인덱스를 가진 2차적 배열
				arr[i] = p;
			}

			// 총점 기준으로 순위 설정
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i][4] < arr[j][4])
						arr[i][7]++;
				}
			}

			// 정렬
			double[] tmp = new double[8]; // 빈 더블형 배열 생성하기
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i][7] > arr[j][7]) {
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}

			System.out.println();
			// [ 번호, 국어, 수학, 영어, 총점, 평균, 학점, 순위]
			System.out.println("번호\t국어\t수학\t영어\t총점\t평균\t학점\t순위");
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (j <= 4 || j == 7)
						System.out.print((int) (arr[i][j]) + "\t");
					else if (j == 6)
						System.out.print((char) (arr[i][j]) + "\t");
					else
						System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
		}

	}
}
