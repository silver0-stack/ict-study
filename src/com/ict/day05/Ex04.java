package com.ict.day05;


import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			while(true) {
				System.out.print("숫자 입력 : ");
				int su = scan.nextInt();
				String result = "";
				if(su % 2 == 0) {
					result = "짝수";
				}else {
					result = "홀수";
				}
				System.out.println(su + "는 " + result + " 입니다.");
				
				System.out.print("계속할까요?(1.yes, 2.no) >> ");
				int res = scan.nextInt();
				// 2 일때만 빠져나간다.
				// if(res == 2) {
				//	 break;
				// }
				
				// 1 일때만 계속하는 방식
				if(res==0 ||(res>=2 && res<=9)) {
					break;
				}
			}
		}
		System.out.println("수고하셧습니다.");
	}
}
