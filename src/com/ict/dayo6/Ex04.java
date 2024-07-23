package com.ict.dayo6;

import java.util.Arrays;
import java.util.Collections;

public class Ex04 {
	public static void main(String[] args) {
		// Arrays 클래스: 배열을 다루기 위한 다양한 메소드가 포함되어 있는 클래스
		// 클래스가 가질 수 있는 요소 3 개: 필드, 메소드, 생성자
		// 1. 필드: 변수와 상수 => 데이터, 상태, 특성
		// 2. 메소드: 동작, 행동 , 하는것
		// 3. 생성자: 나중에 배우자
		
		/* [배열 정렬]
		 * Arrays.sort() 
		 * 배열을 오름차순으로 정렬
		 * 기본 자료형은 내림차순을 만들 수 없다
		 * 단, 오름차순 된 배열을 반대로 호출할 순 있음*/
		int[] arr= {5,4,3,2,1};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		System.out.println("오름차순 배열 역순 정렬");
		// 오름차순 배열을 뒤집어 호출
		// arr={1,2,3,4,5}
		// arr_={1,2,3,4,5}
		int[] arr_=Arrays.copyOf(arr, arr.length);
		
		int k = 0;
		for(int i=arr.length-1; i>=0; i--) {
			arr_[k++]=arr[i];
		}
		
			System.out.println(Arrays.toString(arr_));
		
			
			
			System.out.println();

		
		
		/* [배열 검색]
		 * 이진검색 알고리즘은 정렬된 데이터 집합에서 특정 값을 효율적으로 찾는 법이다.
		 * Arrays.binarySearch(배열, 찾을 값)
		 * 
		 * 1. 데이터 집합의 중간 요소를 선택한다
		 * 2. 선택한 요소가 찾는 값과 같으면 검색 종료
		 * 3. 찾는 값이 선택한 요소보다 작으면 선택한 요소의 왼쪽 하위 배열(즉, 중간 요소보다 작은 값들로 이루어진 부분)에서
		 * 검색을 계속한다
		 * 4. 찾는 값이 선택한 요소보다 크면, 선택한 요소의 오른쪽 하위 배열(즉, 중간 요소보다 큰 값들로 이루어진 부분)에서 검색을 계속한다.
		 * 5. 이 과정을 찾는 값이 발견되거나 검색할 하위 배열이 없을 때까지 반복한다.
		 * 
		 * 이진검색 알고리즘은 각 단계에서 검색 범위를 절반으로 줄이므로 매우 효율적이다. 
		 * 그러려면 데이터 집합이 정렬되어 있어야 한다.
		 * 
		 * 해당 배열에서 값을 검색한 후 위치한 해당 인덱스 값을 반환
		 * 이 메소드는 이진 검색 알고리즘을 사용하므로 배열이 정렬되어 있어야 한다
		 * */
		int[] arr2= {1,4,3,5};
		Arrays.sort(arr2); // {1, 3, 4, 5, 8, 9, 9}
		int index=Arrays.binarySearch(arr2, 3);
		System.out.println(index); // 1;
		System.out.println();
		
		
		/* [배열 복사]
		 * Arrays.copyOf(배열명, 새로만든 배열의 길이)
		 * 배열의 특정 부분을 복사하여 새 배열 생성
		 * */
		int[] arr3= {1,2,3,4,5,6,7};
		int[] copied=Arrays.copyOf(arr3, 7);
		System.out.println(Arrays.toString(copied)); // [1,2,3,4,5,6,7]
		System.out.println();
		
		
		/* [인덱스 지정 배열 복사]*
		 * Arrays.copyOfRange(변수명, 시작인덱스, 끝인덱스(포함안됨))
		 * 
		 * */
		int[] arr6=Arrays.copyOfRange(copied, 2, 6);
		System.out.println(Arrays.toString(arr6)); //[3,4,5,6]
		
		System.out.println();
		
		
		/* [배열 비교]
		 * Arrays.equals(비교배열명1, 비교배열명2)
		 * equals() 메소드는 두 객체의 참조가 같은지를 확인한다
		 * 즉, 두 변수가 동일한 객체를 가리키고 있는지를 검사하는 거다
		 * 따라서
		 * */
		int[] arr4= {1,2,3,4,5};
		int[] arr5= {1,2,3,4,5};
		boolean isEqual=Arrays.equals(arr4, arr5);
		System.out.println(isEqual); // true
		
		System.out.println();
		
		
		
		/*[배열 초기값 지정]
		 * Arrays.fill(배열명, 초기값)
		 * */
		int[] arr7=new int[6];
		Arrays.fill(arr7, 3);
		for(int i=0;i<arr7.length;i++) {
			System.out.println("arr7["+i+"] = "+arr7[i]); // arr7[i] = 3
		}
		
		System.out.println();
		System.out.println("컬렉션 사용해서 내림차순 만들기(자세한 내용은 뒤에서)");
		/* 주의 사항 : Int 가 아니라 Integer 클래스 사용*/
		Integer[] arr11= {7,9,15,2,0,6,3};
		Arrays.sort(arr11, Collections.reverseOrder());
		for(int i=0;i<arr11.length-1;i++) {
			System.out.println("arr11["+i+"] = "+arr11[i]);
		}
		
		
		
		// TODO Arrays.asList() 배열 -> 리스트
		
		// TODO List의 toArray() 리스트 -> 배열
	}
}
