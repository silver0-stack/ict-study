package com.ict.day02;

public class Ex03 {
	public static void main(String[] args) {
		/* 형 변환(casting): 
		* 자동 형 변환: 작은 단위 -> 큰 단위(promotion 승진), 정보 손실 우려 없음
		* 강제 형 변환: 큰 단위 -> 작은 단위(demotion 강등), 정보 손실 우려 있음
		* */
		
		char ch= 'A';
		
		// 정보 손실 우려 없음
		int su=ch;
		double do1=ch;
		
		// 정보 손실 우려 있음
		double do2=10;
		
		
		//int su2=do2; 오류남
		//char ch2=do2; 그래서 강제 캐스팅
		
		
		int su2= (int) do2;
		char ch2=(char) do2;
		
		// 자료형 이름= (왼쪽자료형)(데이터)
		int su3=(int) 34.1;
		System.out.println(su3); //34
		
		byte su4=(byte)(129);
		System.out.println(su4); // -128
		
		
		int su5=65;
		// 분명 char에 65는 포함되지만 65를 대입한 su5를 그대로 대입하면 정보 손실 때문에 오류 
		//그래서 디모션(강제 형변환)한다
		char ch4=(char) su5;
		System.out.println(ch4); // A
		
		double num=486.2121215;
		num*=100;
		System.out.println(num);
		
		int su6=(int) num;
		System.out.println(su6);
		System.out.println(su6/100); // (int) 연산 (int) = (int)
		System.out.println((double)su6/100); // (double) 연산 (int) = (double)
		System.out.println(su6/100.0); // (int) 연산 (double)=(double)
		
		// **num을 소수점 두번째 자리까지 구하기
		num=486.2148745;
		double d=(int)(num*100)/100.0;
		System.out.println("소수점 두번째 자리까지: "+d);
		
		
		double sh=(int)(535.8547*100) / 100.0;
		System.out.println(sh);
		
		
		double num2=486.2148745;
		num2/=10; //48.62148745
		System.out.println(num2);
		
		int k =(int)num2;
		System.out.println(k); //48
		
		int k2=k*10;
		System.out.println(k2); //480
		
		// **일의 자리 절삭하기
		num2=486.2148745;
		int k3=(int)(num2/10)*10;
		System.out.println(k3);
		
		
	}
}
