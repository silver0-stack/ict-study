package com.ict.day10;

public class Ex01 {
	// 클래스는 자료형과 상관없이 저장 가능: 배열과의 차이점
	String name = "";
	static int kor = 80;
	static double eng = 82.5;
	static int math = 85;
	static double sum = 0;
	double avg = 0.0;
	// static 변수
	static char hak = ' ';

	// 메소드(): 기능, 동작, 하는것
	// 해당 메소드를 호출하면 실행 후 호출한 곳으로 되돌아 간다.
	// 되돌아 갈 때 값을 가지고 가는 메소드도 있고(자료형 있는 반환형)
	// 가지고 가지 않는 메소드도 있다(void())
	public static double sum(int kor, double eng, int math) {
		// 메소드 안에서 선언한 변수는 지역변수
		// 메소드 안에서 만들어진 s는 메소드가 끝나서
		// 자기를 호출한 곳으로 되돌아 갈 때 사라진다.
		return kor+eng+math;
	}
	
	
	/*
	public static int sum2(int kor, int eng, int math) {
		// [지역변수를 static으로 사용할 수 없다.]
		// 지역변수는 메소드가 호출될 때 생성해서 메소드가 끝나면 사라지는데
		// static 변수는 프로그램 시작부터 끝까지 존재하는 변수니 모순이 발생한다.
		// 따라서 메소드 안에 static 변수 선언 불가능
		static int s=kor+eng+math;
		return s;
	}
	*/
	
	public static void sum() {
		sum=kor+eng+math;
		System.out.println(sum);
	}
	public String string_sum() {
		return(String.valueOf(kor+eng+math));
	}
	
	public static double avg() {
		return ((int)(sum(kor,eng,math)/3.0*100)/100.0);
	}
	
	// static 메소드에서 필드를 사용하려면 그 필드도 static 필드여야 한다.
	public static char hak(double avg) {
		if(avg>=90) hak='A';
		else if(avg>=80) hak='B';
		else if(avg>=70) hak='C';
		else if(avg>=60) hak='D';
		else hak='F';
		return hak;
	}
}
