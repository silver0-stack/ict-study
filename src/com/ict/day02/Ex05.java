package com.ict.day02;

public class Ex05 {
	public static void main(String[] args) {
		// 연상 대상:byte, short, char, int, long, float, double
		
		int result=0;
		int n1=9;
		int n2=4;
		
		result=n1+n2;
		System.out.println(n1+"+"+n2+"="+result);
		result=n1-n2;
		System.out.println(n1+"-"+n2+"="+result);
		result=n1*n2;
		System.out.println(n1+"*"+n2+"="+result);
		// int 와 int 의 연산이기에 답은 절대 소수점으로 떨어지지 않음 (무조건 정수)
		result=n1/n2;
		System.out.println(n1+"/"+n2+"="+result);
		result=n1%n2;//(나머지)
		System.out.println(n1+"%"+n2+"="+result);
		
//		System.out.println(n1+"+"+n2+"="+(n1+n2));
		
	}
}
