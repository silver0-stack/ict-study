package com.ict.day08;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * 다차원 배열: 1차원 배열이 여러 개 모인 것 종류: 기본자료형 배열(기본자료형을 배열에 담는다), 객체형배열(참조자료형 배열 = 클래스를
		 * 배열에 담는다) 고정길이 배열, 가변길이 배열
		 */

		/*
		 * [고정길이 배열] 1. 선언: 자료형[][] 이름; 또는 자료형 이름[][]
		 */

		int[][] su;

		/* 2. 생성: 이름 = new 자료형[1차원배열크기][1차원 배열 안에 있는 배열의 크기] */
		su = new int[2][3];

		/* 3. for 문을 이용한 데이터 출력*/
		for (int i = 0; i < su.length; i++) {
			// 고정길이 배열일때는 바로 숫자를 대입해도 문제없지만
			// 가변길이 배열일때는 su[i].length로 2차원 배열 길이를 얻는다
			for (int j = 0; j < su[i].length; j++) {
				su[i][j] = i + 5;
				System.out.println(su[i][j]);
			}
		}
		System.out.println();
		
		// 다차원 배열을 출력하기 위해선 Arrays.toString() 으론 안되고
		// Arrays.deepToString() 메소드를 사용해야 한다.
		System.out.println(Arrays.deepToString(su));

	}
}
