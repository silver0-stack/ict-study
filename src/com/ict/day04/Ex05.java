package com.ict.day04;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("첫번째 수 : "); 
			int su1 = scan.nextInt();
			
			System.out.print("두번째 수 : ");
			int su2 = scan.nextInt();
			
			System.out.print("연산자( +, -, *, / ) : ");
			String op = scan.next();
			double result = 0.0 ;
			
			// su2가 0이면서 연산자가 / 인 경우 계산 불가 
			if(su2 == 0 && op.equals("/") ) {
				System.out.println("계산 불가");
			}else{
				switch (op) {
					case "+":
						result = su1 + su2 ;
						break;
					case "-":
						result = su1 - su2 ;
						break;
					case "*":
						result = su1 * su2 ;
						break;
					case "/":
						result = (int)(su1 / (su2 * 1.0) * 100)/100.0 ;
						break;
				}
				System.out.println(su1 + op + su2 + "=" + result);
				
			}
		}
	}
}
