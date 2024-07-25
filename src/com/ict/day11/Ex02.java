package com.ict.day11;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		Ex01 e = new Ex01();
		int[] k = { 10, 20, 30, 40, 50 };
		int n = 50;
		int n2 = e.add(n);
		
		System.out.println(n);
		System.out.println(n2); // 6

		System.out.println();

		System.out.println(Arrays.toString(k));

		// 기존의 for문으로 주소를 참조하니 원본값이 바뀌어버림
		e.add2(k);

		System.out.println(Arrays.toString(k));
		System.out.println(Arrays.toString(k));

	}

}
