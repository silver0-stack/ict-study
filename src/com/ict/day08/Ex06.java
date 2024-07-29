package com.ict.day08;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 영문/숫자/특수문자 중, 2가지 이상 포함
		// 8자 이상 32자 이하 입력(공백 제외)
		// 연속 3자 이상 동일한 문자/숫자 제외
		Scanner scan=new Scanner(System.in);
		//[5][5]
		String[][] members= {
				{"1","admin","1111","어드민","서울"},
				{"2","park","2222","박길동","강운도"},
				{"3","lee","1111","이길동","경기도"},
				{"4","goh","3333","고길동","충청도"},
				{"5","noh","5555","노길동","제주도"},
		};

		
		boolean loggin=false;
		while(loggin==false) {
			System.out.print("아이디: ");
			String id=scan.nextLine();
			System.out.print("패스워드: ");
			String pw=scan.nextLine();
			
			for(int i=0;i<members.length;i++) {
				if(members[i][1].equals(id)) {
					if(members[i][2].equals(pw)) {
						loggin=true;
						System.out.println(Arrays.toString(members[i]));
						break;
					}
				}
				
			}
			if(loggin) {
				System.out.println("\n로그인 성공!!");
				
			}else{
				System.out.println("\n아이디나 패스워드 불일치 로그인 실패\n");
				continue;
				
			}
			
		}
		
		
	}

}
