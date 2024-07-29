package com.ict.day11;

public class Ex04 {
	public static void main(String[] args) {
		/*오버로딩을 잘 활용해서 코드의 유연성을 높이는게 고급 개발자의 덕목*/
		Ex03 e=new Ex03();
		double s1=e.plus(10, 15);
		System.out.println(s1);
		
		double s2=e.plus("10","15");
		System.out.println(s2);
	}
}
