package com.ict.day09;

import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
		// Math 클래스: 수학에서 자주 사용되는 상수들과 static 메소드로 이루어짐
		// static 변수는 미리 만들어놔야 하는 변수이기에 instance가 아닌 static 변수로 다 만들어버리면
		// 메모리 낭비로 속도 저하 (재사용 이슈)
		System.out.println(Math.PI);
		
		// Math 클래스는 객체 생성할 수 없다
		// Math.메소드 이름() 이용해서 사용해야 한다.
		// 1. random(): 0.0 <= x < 1.0 의 임의의 난수 발생
		System.out.println((int)Math.random());// 무조건 0
		System.out.println((int)(Math.random()*10)); // 0-9
		
		// 2. ceil() : 올림, round(): 반올림, floor: 버림
		System.out.println("ceil: 가장 큰 정수 찾기");
		System.out.println(Math.ceil(10.1)); //11.0
		System.out.println(Math.ceil(10.6)); //11.0
		System.out.println(Math.ceil(-10.1)); // -10.0
		System.out.println(Math.ceil(-10.6)); //-10.0
		
		
		System.out.println("floor: 작은 정수 찾기");
		System.out.println(Math.floor(10.1)); //10
		System.out.println(Math.floor(10.6)); //10
		System.out.println(Math.floor(-10.1)); //-11.0
		System.out.println(Math.floor(-10.6)); //-11.0
		
		
		// 소수점 첫째자리가 기준이다 보니 반환형 정수(long)
		System.out.println("round: 반올림(소수점 첫째자리기준)");
		System.out.println(Math.round(10.1)); //10
		System.out.println(Math.round(10.6)); //11
		System.out.println(Math.round(-10.1)); //-10
		System.out.println(Math.round(-10.6)); //-10
		
		
		// abs() : 절댓값(양수 ->양수, 음수 -> 양수)
		System.out.println("abs: 절댓값");
		System.out.println(Math.abs(-10.1)); //10.1
		System.out.println(Math.abs(10.6)); //10.6
		
		
		// max(n1,n2) : 큰 값  
		// min(n1,n2) : 작은 값 
		System.out.println("max: 큰 값 선정");
		System.out.println(Math.max(-10.1,-11)); //-10.1
		System.out.println(Math.min(10.6, 11)); //10.6
		
		
		Random random=new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextDouble());
		System.out.println(random.nextBoolean());
		
		
	}

}
