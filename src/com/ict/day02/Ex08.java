package com.ict.day02;

public class Ex08 {
	public static void main(String[] args) {
	
		int total=9630;
		
		int h=0;int m=0;int s=0;	
		
		int res=0;
		
		h=total/3600;
		res=total%3600;
		m=res/60;
		s=res%60;
		
		System.out.println(h+"시간"+m+"분"+s+"초");
	}
}
