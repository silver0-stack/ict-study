package com.ict.day03;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		try (//  이름, 국어, 영어, 수학 점수 받아서 총점과 평균 내기
		Scanner scan = new Scanner(System.in)) {
			System.out.print("이름: ");
			String name=scan.next();
			System.out.print("국어: ");
			Double kor=scan.nextDouble();
			System.out.print("영어: ");
			Double eng=scan.nextDouble();
			System.out.print("수학: ");
			Double math=scan.nextDouble();
			
			Double tot=kor+math+eng;
			Double avg=tot/3.0;
			Double avg_=(int)(avg*100)/100.0;
			
			System.out.println();
			
			System.out.println("이름: "+name+" 국어: "+kor+" 영어: "+eng+" 수학: "+math);
			System.out.println("총점: "+tot+'\n'+"소수 둘째 자리 평균: "+avg_);
		}
		
	}
}
