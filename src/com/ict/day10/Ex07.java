package com.ict.day10;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Ex06 ex=new Ex06();
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("이름: ");
			String name=scan.nextLine();
			System.out.print("국어: ");
			int k=scan.nextInt();
			System.out.print("영어: ");
			int e=scan.nextInt();
			System.out.print("수학: ");
			int m=scan.nextInt();
			
			ex.name(name);
			ex.sum(k,m,e);
			
		}
	
		
	}

}
