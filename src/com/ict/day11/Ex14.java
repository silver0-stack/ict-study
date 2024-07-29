package com.ict.day11;

public class Ex14 {
	public static void main(String[] args) {
		Ex13 e=new Ex13();
		e.setTitle("sheena ringo");
		e.setReview("best rocker in Japan");
		System.out.println(e.toString());
		// int가 기본자료형이라 기본값인 0 출력
		System.out.println(e.count);
		// 기본자료형인 boolean의 기본값이 false라 false 출력
		System.out.println(e.isLive());
	}

}
