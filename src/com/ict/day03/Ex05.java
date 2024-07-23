package com.ict.day03;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		try (// 초를 입력받아서 시, 분, 초로 출력하자
		Scanner scan = new Scanner(System.in)) {
			System.out.print("초: ");
			int sec=scan.nextInt();
			
			int h=sec/3600; //시간 구하기
			int m=sec%3600/60; // 시간 계산의 나머지 초를 60으로 나눠 분 구하기
			int s=sec%3600%60; // 분 계산의 나머지 초를 60으로 나눠서 초 구하기
			
			System.out.println(sec+"초는 "+h+"시"+m+"분"+s+"초 입니다.");
		}
	}
}
