package com.ict.day02;

public class Ex01 {
 public static void main(String[] args) {
	 // 숫자형은 정수형과 실수형이 있다
	 // 정수형 소수점이 없는 숫자
	 // 실수형 소수짐이 있는 숫자
	 // 정수 < 실수
	 
	 // 정수: byte < short < int(기본) < long
	 // 실수: float < double(기본)
	 
	 // byte : -128 ~ 127
	 byte b1=100;
	 System.out.println(b1);
	 
	 b1=-120;
	 System.out.println(b1);
	 
	 b1=(byte) (120+10);
	 System.out.println(b1);
	 
	 //short : -32,768~ 32,767
	 //byte 처럼 범위를 넘으면 사용불가
	 //** 우리는 특별한 경우를 제외하고 byte, short 를 사용안함
	 
	 // int: 정수의 기본형이다.
	 int su=34;
	 System.out.println(su);
	 
	 // long: "정수 중 가장 큰 값
	 // 		큰 정수를 사용할 때 호출하는 자료형
	 // 		숫자 뒤에 L 또는 l을 붙인다. (생략가능)
	 long num=32L;
	 long num2=-100;
	 
	
	 // 작은 단위에 큰 단위 못들어감
	 //int num3=20L;
	 
	 // 실수형: float<double(기본)
	 // float 숫자 뒤에 반드시 F나 f를 붙인다.(생략불가)
	 float f1=321.41f;
	 
	 // float = double ->큰 다위가 작은 단위에 저장 될 때는 오류 발생
	 //float f2=31.457;
	 
	 System.out.println(f1);
	 System.out.println();
	 
	 
	 // double = float, int, long -> 작은 단위가 큰단위로 간다
	 double do1=15.77;
	 double do2=215.2F;
	 double do3=10;
	 double do4=10L;
	 
	 
	 // float나 double은 부동 소수점의 값을 표현한다
	 // 정확하게 표현이 안돼서 오류 발생한다.
	 // 해셯) 나중에 BigDecimal 클래스를 자료형으로 사용한다.
	 // 지금은 소수점 둘째자리까지 구하자.
	 System.out.println(do1);
	 System.out.println(do2);
	 System.out.println(do3);
	 System.out.println(do4);
 }
}
