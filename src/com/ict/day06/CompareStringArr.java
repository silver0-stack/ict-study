package com.ict.day06;

import java.util.Arrays;

public class CompareStringArr {
	public static void main(String[] args) {
		// 문자열 배열: {"Hello", "World", "Java", "ICT", "Korea"}
		// 주어진 문자열 배열을 복사하여 새 배열을 생성하고, 이 두 배열이 같은지 비교하는 코드를 작성해 보세요.
		String[] arr= {"Hello", "World", "Java", "ICT", "Korea"};
		String[] copied=Arrays.copyOf(arr, 5);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copied));
		
		boolean isEqual=arr.equals(copied);
		boolean isEqual2=Arrays.equals(arr, copied);
		
		if(isEqual) System.out.println(" equals() 메소드 검사 결과 같은 배열입니다");
		else System.out.println("equals() 메소드 검사 결과 다른 배열입니다");
		
		if(isEqual2) System.out.println(" Arrays.equals(a,b) 메소드 검사 결과 같은 배열입니다");
		else System.out.println("Arrays.equals(a,b) 메소드 검사 결과 다른 배열입니다");
	}
}

