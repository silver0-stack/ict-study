package com.ict.day10;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("이름: ");
			String name = scan.nextLine();
			System.out.print("국어: ");
			int k = scan.nextInt();
			System.out.print("영어: ");
			int e = scan.nextInt();
			System.out.print("수학: ");
			int m = scan.nextInt();
			scan.nextLine();

	
			Ex09 ex = new Ex09(name, k, e, m);
			ex.sum();
			System.out.println(ex.toString());
			
		}
	}
}
