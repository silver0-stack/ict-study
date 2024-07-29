package com.ict.day08;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 * 가변길이 선언: 자료형[][] 이름; 또는 자료형 이름[][]
		 */
		System.out.println("가변길이 일때만 사용 가능");
		int[][] su = new int[3][];

		int[] k1 = { 10, 54 };
		int[] k2 = { 100, 94 };
		int[] k3 = { 7, 31 };

		su[0] = k1;
		su[1] = k2;
		su[2] = k3;

		System.out.println(Arrays.deepToString(su));

		char[][] ch = new char[4][];

		char[] c1 = "java".toCharArray();
		char[] c2 = "c++".toCharArray();
		char[] c3 = "python".toCharArray();
		char[] c4 = "react".toCharArray();

		ch[0] = c1;
		ch[1] = c2;
		ch[2] = c3;
		ch[3] = c4;

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}
		System.out.println();

	}

}
