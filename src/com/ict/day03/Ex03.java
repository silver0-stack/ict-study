package com.ict.day03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// import : 수입, 회사에서 제공하는 클래스를 가져다가 사용하기 위함
		// 패키지가 java.lang 안에 존재하는 클래스는 import 안함
		// import 방법: 1) ctrl + space 바
		// 			   2) 자동 import -> ctrl + shift + o(소문자)
		
		try (// 키보드에 입력한 정보를 받아서 scan 이라는 변수에 저장
		Scanner scan = new Scanner(System.in)) {
			// 키보드 통해서 들어오는 정보: 문자열(String), 숫자(정수, 실수)
			// .next() : 키보드로 입력한 내용ㅇ르 String 형으로 처리하는 메소드
			//			띄어쓰기 전까지 또는 Enter 전까지 
			System.out.print("이름: ");
			String name=scan.nextLine();
			System.out.println("당신의 이름은 "+name);
			
			// 키보드로 입력한 숫자는 자바에서 문자열 또는 숫자로 변경할 수 있다
			System.out.print("나이: ");
			int age=scan.nextInt();
			//System.out.println("당신의 나이는 "+(age+1)); // 241
			
			System.out.println("당신의 나이는 "+(age+1)); // 25
			
			// .nextDouble(): 입력한 내용을 double 형으로 처리하는 메소드
			System.out.println("키: ");
			double height=scan.nextDouble();
			System.out.println("당신의 키는 "+(height+1));
		}
	}

}
