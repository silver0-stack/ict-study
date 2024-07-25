package com.ict.day11;

public class Ex03 {
	/*
	 * [오버로딩(중복정의)] 같은 클래스에서 같은 이름의 메소드를 여러개 정의하는 것 단,인자의 자료형이나 개수가 달라야 한다.
	 * String을 매개변수로 받고 다 파싱 해주는 메소드를 미리 정의하면 메인메소드에서 코드의 유연상 올라간다
	 */

	public double plus(int s1, int s2) {
		double sum = s1 + s2;
		return sum;
	}

	// 인자의 자료형이 다르니까 오버로딩 가능하다
	public double plus(int s1, double s2) {
		double sum = s1 + s2;
		return sum;
	}

	// 자료형의 순서가 바뀌어도 오버로딩 가능하다
	public double plus(double s1, int s2) {
		double sum = s1 + s2;
		return sum;
	}
	
	public double plus(String s1, String s2) {
		double sum = Double.parseDouble(s1)+Double.parseDouble(s2);
		return sum;
	}
	
	public double plus(int s1, String s2) {
		//double sum = s1+Double.parseDouble(s2);
		double k1=Double.parseDouble(s2);
		double sum=plus(s1,k1);
		return sum;
	}
}
