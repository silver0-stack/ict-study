package com.ict.day04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("나라: ");
			String ctr=scan.nextLine();
			
			switch(ctr) {
			case "한국":
				ctr="서울";
				break;
			case "중국":
				ctr="베이징";
				break;
			case "일본":
				ctr="도쿄";
				break;
			case "미국":
				ctr="워싱턴";
				break;
			default:
			}
			System.out.println(ctr);
		}
		
		

	

	}
}
