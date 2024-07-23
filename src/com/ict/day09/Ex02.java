package com.ict.day09;

public class Ex02 {
	// 클래스 구성요소: 멤버필드, 멤버메소드, 생성자
	// 멤버필드: 데이터, 상태값, 속성
	//		  변수: 가변의 값, 메모리 상태
	//		  상수: 불변의 값, 메모리 상태
	// [instance 변스와 static 변수]
	// instance는 객체 생성이 필수인 반면 static은 객체 생성과 관계없이 (클래스.static변수)의 형식으로 사용할 수 있다.
	// static은 반드시 static 예약어 표시
	
	// 변수에 final이 있으면 상수
	String name="홍길동"; // instacne 변수
	final int SUM=280; // instance 상수
	static double avg=93.33; // static 변수
	static final char HAK='A'; // static 상수
	
}
