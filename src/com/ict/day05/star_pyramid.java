package com.ict.day05;

public class star_pyramid {
	 public static void main(String[] args) {
	        int rows = 4; // 피라미드의 행 수

	        for(int i = 0; i < rows; i++) {
	            for(int j = 0; j < rows - i; j++) {
	                System.out.print(" "); // 공백 출력
	            }
	            for(int k = 0; k <= i * 2; k++) {
	                System.out.print("*"); // 별 출력
	            }
	            System.out.println(); // 줄 바꿈
	        }
	        
	        System.out.println();
	        
	        // 위쪽 피라미드 출력
	        for(int i = 0; i < rows; i++) {
	            for(int j = 0; j < rows - i; j++) {
	                System.out.print(" "); // 공백 출력
	            }
	            for(int k = 0; k <= i * 2; k++) {
	                System.out.print("*"); // 별 출력
	            }
	            System.out.println(); // 줄 바꿈
	        }

	        // 아래쪽 피라미드 출력
	        for(int i = rows - 2; i >= 0; i--) {
	            for(int j = 0; j < rows - i; j++) {
	                System.out.print(" "); // 공백 출력
	            }
	            for(int k = 0; k <= i * 2; k++) {
	                System.out.print("*"); // 별 출력
	            }
	            System.out.println(); // 줄 바꿈
	        }
	    }
}
