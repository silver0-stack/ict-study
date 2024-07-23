package com.ict.day04;

public class Ex06 {
	public static void main(String[] args) {
		int result = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			System.out.println("안녕하세요");
			System.out.println("-------------------");
		}
		System.out.println();
		
		
		System.out.println("=====10~20까지 출력해보자!======");

		for (int i = 10; i < 21; i++) {
				result = i;
				System.out.println(result);
			
		}
	
		System.out.println("=====짝수만 출력해보자!======");

		for (int i = 10; i < 21; i++) {
			if (i % 2 == 0) {
				result = i;
				System.out.println(result);
			}
		}
		System.out.println("======홀수만 출력해보자!======");
		for (int i = 10; i < 21; i++) {
			if (i % 2 == 1) {
				result = i;
				System.out.println(result);
			}

		}
		
		System.out.println("======1~100 중 7의 배수 출력해보자!======");
		for (int i = 1; i < 101; i++) {
			if (i % 7 == 0) {
				result = i;
				System.out.println(result);
			}
		}
		
		
		System.out.println("======5단 출력!======");
		for (int i = 1; i < 10; i++) {
				System.out.println("5 * "+i+" = "+ 5*i);
			}
		
		System.out.println("\n\n");
		System.out.println("=================");
		System.out.println("\n");
		/*
		0 0 0 0
		0 0 0 0
		0 0 0 0
		0 0 0 0

		1 0 0 0
		0 1 0 0
		0 0 1 0
		0 0 0 1
		*/
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i==j) System.out.print("1 ");
				else System.out.print("0 ");
			}
			System.out.println();
		}
		
	System.out.println();
	System.out.println("========1~10 누적합=========");
	result=0;
	// 1+2+3+4+5+6+7+8+9+10
	for(int i=1;i<11;i++) {
		result+=i;
	}
	System.out.println(result);
	
	
	// 1~10까지 홀합과 짝합 각각 구하자
	System.out.println();
	System.out.println("========1~10 짝수 홀수 누적합=========");
	int odd=0;
	int even=0;
	
	for(int i=1;i<11;i++) {
		if(i%2==0) even+=i;
		else odd+=i;
	}
	System.out.println("짝수의 합: "+even);
	System.out.println("홀수의 합: "+odd);
	
	
	
	
	System.out.println();
	System.out.println("========7! 구하기=========");
	//7!
	int f = 1;
	for(int i=1;i<8;i++) {
		f*=i;
	}
	System.out.println("7! : "+ f);
	
	
	
	
	}
}

