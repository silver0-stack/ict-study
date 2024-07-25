package com.ict.day11;

public class Ex12 {
	public static void main(String[] args) {
		Ex11 ex=new Ex11(true,3,"큰뿔소");
		System.out.println(ex.isLive());
		ex.setName("펭퀸");
		System.out.println(ex.toString());

	}

}
