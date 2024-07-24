package com.ict.day10;

public class Ex02 {

	int age =14;
	
	public static void main(String[] args) {
		
		// static 메소드 안에서 static 이 아닌 instance 변수를 사용할 수 없음
		//static 변수로 만들어야 사용 가능
		//System.out.println(age);
		
		// 메소드 안의 지역변수로 static 변수 못 만든다
		// static main메소드 안에 static 지역 변수 불가능
		// static 변수는 무조건 전역변수로 !!
		//static int k2=10;
		
		int s1=Ex01.kor;
		System.out.println("국어: "+s1); // 국어: 80
		
		Ex01.sum(); // 240
		
		// 반환값(리턴값)이 있는 함수를 sysout 없이 덜렁 호출만 하면 출력이 되지 않음
		// 무조건 sysout으로 출력해야 찍힘
		System.out.println(Ex01.avg()); // 80
		System.out.println(Ex01.hak(Ex01.avg())); // B
		Ex01 ex01=new Ex01();
		System.out.println(ex01.string_sum()); //240
	}

}
