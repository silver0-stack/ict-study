package com.ict.day03;

public class Ex11 {
	public static void main(String[] args) {
		// k1이 홀짝인지 판별
		int k1=42;
		String result="";
		if(k1%2==0) result="짝수";
		else result="홀수";
		System.out.println(result);
		
		// k1이 60 이상이면 합격 아니면 불합격
		k1 = 78;
		result = "";
		if (k1 >= 60) result="합격";
		else result="불합격";
		System.out.println(result);
		
		// 1이면 가격에 10퍼 할인 (가격 2500)
		k1=1;
		int price=2500;
		if(k1==1)price*=0.9;
		System.out.println(price);
		
		// 대문자인지 아닌지 판별
		char c='D';
		if(c>='A'&&c<='Z') result="대문자 맞음";
		else result="대문자 아님";
		System.out.println(result);
		
		// 근무시간이 8시간 까지는 9860.
		// 8시간 초과하면 초과한 시간만큼 1.5배 지금
		//근무시간이 10시간이면 보수는 얼마?
		int time=10;
		int dan=9860;
		int pay=0;
		if(time>8) pay=dan*8+(int)(dan*1.5*(time-8));
		else pay=dan*8;
		System.out.println(pay);
		
	}
}
