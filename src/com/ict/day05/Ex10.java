package com.ict.day05;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		// 전체횟수, 짝수가 나온 퍼센트를 구하자 !
		
		try (Scanner scan = new Scanner(System.in)) {
			
			int even_n=0; //짝수가 나온 횟수
			int odd_n=0;
			
			// 전체 횟수
			int iter=0;
			// 짝수가 나올 퍼센트 변수 선언
			// 2를 누르면 전체를 빠져나가는 라벨
			exit: while (true) {
				System.out.println("\n===========GAME START!===========");
				System.out.print("숫자 입력: ");
				int su = scan.nextInt();
				String res = "";
				if (su % 2 == 0) {
					res = "짝수";
					even_n++;
				} else {
					res = "홀수";
					odd_n++;
				}

				System.out.println(su + "는 " + res + " 입니다.");
				
				
				double even_per=even_n/(even_n+odd_n*1.0)*100;
				while (true) {
					
					System.out.print("\n\n\t\t계속할까요?(1. yes 2. no) >> ");
					iter++;
					int result = scan.nextInt();
					
					if (result == 1)
						continue exit; // 다시 exit while 문 시작
					else if (result == 2) {
						System.out.println();
						String header = "┌──────────────────────────────────────┐";
						String footer = "└──────────────────────────────────────┘";
						String format = "│   %-30s ";

						System.out.println(header);
						System.out.println(String.format(format, ""));
						System.out.println(String.format(format, "전체 횟수: "+iter));
						System.out.println(String.format(format, "짝수횟수: "+even_n));
						System.out.println(String.format(format, "짝수가 나온 퍼센트: "+(int)(even_per*100)/100.0+" %"));
						System.out.println(String.format(format, ""));
						System.out.println(String.format(format, "👾👾👾   GAME OVER    👾👾👾"));
						System.out.println(String.format(format, ""));
						System.out.println(footer);


						break exit; // exit while문 탈출
					} else {
						System.out.println("\n1과 2의 선택지 중 선택해주세요!");
						continue; // 다시 물어봄
					}
				}

			}
		} 
	}
}
