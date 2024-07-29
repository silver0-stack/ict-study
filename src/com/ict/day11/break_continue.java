package com.ict.day11;

public class break_continue {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			/* i가 4일 때 for루프를 즉시 종료하고 루프 바깥의 코드인 sysout 실행*/
		    if (i == 4) {
		        break;
		    }
		    System.out.println(i);
		}
		
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			/* 루프의 ** 현재 ** 반복을 즉시 종료하고 다음 반복 시작*/
		    if (i == 4) {
		        continue;
		    }
		    System.out.println(i);
		}



	}

}
