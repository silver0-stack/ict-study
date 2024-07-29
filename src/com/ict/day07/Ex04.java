package com.ict.day07;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		/* 입력받기!!!!!! */
		System.out.print("학생 수: ");
		int cnt = scan.nextInt();
		// 아래서 scan.nextLine()으로 받아주니까
		scan.nextLine(); // ???

		String[] name = new String[cnt]; // 이름
		int[] kor = new int[cnt]; // 국어
		int[] eng = new int[cnt]; // 영어
		int[] math = new int[cnt]; // 수학
		int[] sum = new int[cnt]; // 합계
		double[] avg = new double[cnt]; // 평균
		String[] hak = new String[cnt]; // 학점
		int[] rank = new int[cnt]; // 순위

		
		/* 모든 학생의 초기 순위를  1로 설정*/
		for(int i=0;i<cnt;i++) {
			rank[i]=1;
		}
		
		// 입력
		/* [이름, 국어, 영어, 수학] */

		// 배열 입력하기
		for (int i = 0; i < cnt; i++) {
			System.out.print("이름, 국어, 영어, 수학 입력: ");

			// 구분자를 띄어쓰기
			String str = scan.nextLine();
			System.out.println("학생 "+(i+1)+">> " + str);
			// 공백을 기준으로 쪼개기
			String[] in = str.split(" ");
			name[i] = in[0];
			kor[i] = Integer.parseInt(in[1]);
			eng[i] = Integer.parseInt(in[2]);
			math[i] = Integer.parseInt(in[3]);
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int) (sum[i] / 3.0 * 100) / 100.0; // 소수 둘째자리까지

			if (avg[i] >= 90) {
				hak[i] = "A학점";
			} else if (avg[i] >= 80) {
				hak[i] = "B학점";
			} else if (avg[i] >= 70) {
				hak[i] = "C학점";
			} else {
				hak[i] = "F학점";
			}

		}

		// 순위 구하기
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println();
		// 출력하기
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < cnt; i++) {
			System.out.println(name[i] + "\t" + sum[i] + "\t" + avg[i] + "\t" + hak[i] + "\t" + rank[i]);
		}

	}
}
