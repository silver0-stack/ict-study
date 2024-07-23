package com.ict.day08;

import java.util.Arrays;

public class Ex02 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 선언과 생성을 하나로
		// 자료형[][] 이름 = new 자료형[1차우너 배열 크기][1차원 배열 안에 있는 배열 크기]
		System.out.println("고정길이 있을 때만 사용 가능");
		char[][] ch = new char[3][2];

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				ch[i][j] = (char) (i + j);
			}
		}
		System.out.println(Arrays.deepToString(ch));

		System.out.println();
		
		System.out.println("고정 길이, 가변 길이 모두 사용 가능");

		int[][] su = new int[3][2];

		int[] k1 = { 10, 20 };
		int[] k2 = { 100, 200 };
		int[] k3 = { 1000, 2000 };

		su[0] = k1;
		su[1] = k2;
		su[2] = k3;

		System.out.println(Arrays.deepToString(su));
		System.out.println();
		
		// 선언, 생성, 데이터저장 한번에
		int[][] num= {{40,10},{80,60},{10,100},{50,500}};
		
	}
}
