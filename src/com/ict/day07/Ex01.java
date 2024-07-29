package com.ict.day07;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		// 배열의 정렬하기
		int[] su = { 5, 8, 9, 1, 0, 5, 7, 6, 2 };
		Arrays.sort(su);
		for (int i = 0; i < su.length; i++) {
			System.out.print(su[i] + " ");
		}
		System.out.println();

		
		// 중첩 for문으로 정렬하기
		int[] su2 = { 5, 8, 9, 1, 0, 5, 7, 6, 2 };

		int temp=0;
		for(int i=0;i<su2.length-1;i++) {
			for(int j=i+1; j<su2.length;j++) {
				// 오름차순 일 때: 오른쪽이 기준인 i보다 작을 때
				if(su2[i]>su2[j]) {
					temp=su2[i];
					su2[i]=su2[j];
					su2[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(su2));
	}
}
