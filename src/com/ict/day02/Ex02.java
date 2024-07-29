package com.ict.day02;

public class Ex02 {
 public static void main(String[] args) {
	// 숫자 크기 비교
	 // byte < short < char < int < long < float< double.
	 
	 // 큰 자료형 = 작은자료형 (o)
	 // 작은 자료형 = 큰 자료형 (X)
	 
	 
	 int su1= 100;
	 long su2= su1;
	 double su3=su2;
	 char ch1='a';
	 int su5=ch1;
	 // short가 int 보다 작은 단위여서 오류
	 //short sh1=ch1;
	 
	 double su6=ch1;
	 //su6은 double 이므로 실수로 나온다.
	 System.out.println(su6); //97.0
	 //ch1은 char 이므로 결과를 문자로 내보낸다
	 System.out.println(ch1); // a
	 //su5는 int이므로 결과를 정수로 내보낸다.
	 System.out.println(su5); 
}
}
