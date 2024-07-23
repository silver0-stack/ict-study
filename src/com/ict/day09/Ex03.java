package com.ict.day09;

public class Ex03 {

	public static void main(String[] args) {
		// TODO 그러면 private만 안붙으면 어디에서나 static 변수에 접근할 수 있는건지???
		double avg=Ex02.avg;
		char hak=Ex02.HAK;
		System.out.println(avg);
		System.out.println(hak);
		System.out.println("*************************");

		// 객체 생성 안했으니 instance 변수 접근 불가
		//String str=Ex02.name;
		
		Ex02 ex02=new Ex02();
		// 변수는 가변, 상수는 불변.
		ex02.name="미미";
		Ex02.avg=95.45;
		// 상수는 불변이기에 데이터 값 변경 불가
		//ex02.SUM=250;
	
		System.out.println(Ex02.avg); // static 변수라 객체 참조형 변수를 이용해 접근할 필요 x
		System.out.println(Ex02.HAK);  // static 상수라 객체 참조형 변수를 이용해 접근할 필요 x
		System.out.println(ex02.name); // instance 변수라 객체 참조형 변수인 ex02로 접근
		System.out.println(ex02.SUM); // instance 상수라 ex02로 접근
		
		// api 에 있는 static 변수는 다 static final 이다.
	}

}
