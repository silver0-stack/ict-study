package com.ict.day06;

public class Ex01 {
	public static void main(String[] args) {
		// 배열 : 같은 자료형의 데이터들을 한 곳에 모아둔 묶음
		// ** 같은 자료형 이어야 한다.
		// 생성할 때 크기를 지정해야 한다.(크기가 없으면 생성안됨)
		// 한번 지정한 크기는 변경할 수 없다
		// 단, 복사 등을 이용하면 크기가 변경된 배열을 만들 수 있다.
		// **** 배열 안에 데이터를 가져오기 위해서는 for loops 를 사용한다

		// 배열 생성 단계: 선언 -> 생성 -> 초기화 (배열에 데이터 저장)
		// 1. 선언: 자료형[] 변수명 or 자료형 변수명[]
		int[] su;
		double num[];

		// 2. 생성: 변수명 = new 자료형[배열크기=개수]
		// new 예약어를 통해 힙 메모리에 공간 생성, 배열 객체 참조 변수만 스택 메모리에 저장
		// => [인스턴스,객체 생성] 이라고 한다
		su = new int[4];
		num = new double[4];

		System.out.println(su);
		System.out.println(num);
		System.out.println();

		
		
		// 3. 초기화:
		// char 보다 int가 단위가 더 큰 자료형이기에 'c' 대입 가능
		su[0] = 'c';// char 타입의 'c'가 99로 저장된다

		su[1] = 0;
		su[2] = 3;

		su[3] = (int) 2.3;
		
		// 재 초기화 가능 ,기존의 데이터는 사라짐
		su[1] = 2;

		// su 배열 출력
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		System.out.println();
		// 컴파일 에러 안남. 하지만 실행 오류: 존재하지 않는 인덱스에 접근했으니까
		// Runtime Error
		// java.lang.ArrayIndexOutOfBoundsException : 경계에서 벗어난 배열인덱스 예외이다.
		// su[4]=15;

		// int 보다 double 이 더 크니까 int 대입 가능
		for (int i = 0; i < num.length; i++) {
			num[i] = i;
			System.out.println("num[" + i + "] = " + num[i]);
		}

	}
}
