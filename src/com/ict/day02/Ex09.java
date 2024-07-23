package com.ict.day02;

public class Ex09 {
	public static void main(String[] args) {
		// 카페모카가 6500원이다.
		// 친구와 둘이서 15000원 내고 주문했다.
		// 잔돈은 얼마인가? (단, 부가세 10% 포함한다.)
		int org_price=6500*2;
		int taxed_p=(int)(org_price*1.1);
		int change=15000-taxed_p;
		System.out.println("잔돈: "+change);
		
	}
}
