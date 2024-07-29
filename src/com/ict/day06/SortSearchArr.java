package com.ict.day06;

import java.util.Arrays;

public class SortSearchArr {
	public static void main(String[] args) {
		// 정수 배열: {10, 20, 30, 40, 50}
		// 주어진 정수 배열을 내림차순으로 정렬하고, 이 배열에서 값 30을 찾는 코드를 작성해 보세요.
		int[] arr= {10,20,30,40,50};
		/*5 라는 직접적인 값을 대입하지 말고 최대한 함수를 이용할 것 arr.length */
		int[] copied=Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(copied));
		
		// 1. 내림차순 정렬
		int k=0;
		for(int i=arr.length-1; i>=0; i--) {
			copied[k++]=arr[i];
			System.out.println("copied["+k+"] = "+ arr[i]);
		}
		// 역순정렬된 copied 문자열화해서 출력하기
		System.out.println(Arrays.toString(copied));
		
		// 2. 내림차순 정렬을 이진검색 알고리즘으로 각 단계에서 검색 범위를 절반으로 줄이므로 매우 효율적이다
		// 그러므로 데이터 집합이 정렬되어 있어야 한다
		// 데이터를 검색한 후 해당 값이 
		/* Arrays.binarySearch(배열, 찾을 값) 에서 찾을 값은 int 만 되는지, 문자열은 안되는건지*/
			int index=Arrays.binarySearch(copied,30);
			System.out.println("30이 위치한 인덱스는 "+index+"입니다.");
			
		
	}
}
