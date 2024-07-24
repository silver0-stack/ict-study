package com.ict.day10;

public class Ex04 {
	public static void main(String[] args) {
		/* 1. static 변수는 instance 생성없이 호출 가능
		 * 2. static 변수는 프로그램 첨부터 종료될 때까지 존재하므로 새로운 객체를 생성해서 참조해도
		 * 전의 초기값이 공통으로 사용된다 () 
		 * 
		 * 은행에서 고정금리를 쓸 때 static 변수, 그러면 static 변수 하나만 수정하면 일괄 적용되니까 */
		Ex05 t1=new Ex05();
		t1.countUp();
		Ex05.countUp2();
		
		t1.countUp();
		Ex05.countUp2();
		
		t1.countUp();
		Ex05.countUp2();
		
		
		
		System.out.println("cnt1: "+t1.cnt1); //3
		System.out.println("cnt1: "+Ex05.cnt2); //3
		System.out.println("===========================");
		Ex05 t2=new Ex05();
		
		System.out.println("cnt2: "+t2.cnt1); // 0
		System.out.println("cnt2: "+Ex05.cnt2); //3
		
		t2.countUp();
		Ex05.countUp2();
		System.out.println("===========================");
		
		System.out.println("cnt2: "+t2.cnt1); // 1
		System.out.println("cnt2: "+Ex05.cnt2); //4
		
		Ex05 t3=new Ex05();
		
		System.out.println("===========================");
		System.out.println("cnt3: "+t3.cnt1); // 0
		System.out.println("cnt3: "+Ex05.cnt2); //4
		
	}
}
