package com.ict.day10;

public class Ex06 {
	String name="";
	int sum=0;
	double avg=0.0;
	char hak=' ';
	
	public void name(String k1) {
		name=k1;
	}
	
	public void sum(int k1,int k2,int k3) {
		sum=k1+k2+k3;
		avg();
	}
	
	public void avg() {
		avg=(int)(sum/3.0*10) /10.0;
		hak(avg);
	}
	
	public void avg_(double k) {
		avg=k;
	}
	
	// static 메소드에서 필드를 사용하려면 그 필드도 static 필드여야 한다.
	public void hak(double avg) {
		if(avg>=90) hak='A';
		else if(avg>=80) hak='B';
		else if(avg>=70) hak='C';
		else if(avg>=60) hak='D';
		else hak='F';
		println();
	}
	
	public void println() {
		System.out.println("\n이름: "+name);
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avg);
		System.out.println("학점: "+hak);
	}
}
