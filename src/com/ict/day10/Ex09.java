package com.ict.day10;

public class Ex09 {
	private String name="";
	private int s=0;
	private int k=0;
	private int m=0;
	private int e=0;
	private double avg=0.0;
	private char hak=' ';
	
	
	public Ex09(String name, int k,int e,int m) {
		/* super 클래스는 부모클래스의 오브젝트를 참조한다 부모클래스의 메소드, 생성자 호출한다
		 * 부모클래스와 자식클래스가 같은 이름의 메소드를 가질 때 발생할 혼란을 제거하기 위함이다.
		 * Ex09는 따로 extends하지 않기에 Object 클래스를 상속한다. 그래서 super()안써도 무관.
		 * 하지만 상속을 가정하고, 부모클래스가 매개변수가 있는, 기본생성자가 아닌 생성자를 갖는다면
		 * super()에 매개변수를 넣어줘야 오류 안남 
		 * ex) super(40)
		 * */
		super();
		this.name = name;
		this.k=k;
		this.e=e;
		this.m=m;
	}

	public void sum() {
		s=k+m+e;
		avg();
	}
	
	public void avg() {
		avg=(int)(s/3.0*10) /10.0;
		hak();
	}
	
	// static 메소드에서 필드를 사용하려면 그 필드도 static 필드여야 한다.
	public void hak() {
		if(avg>=90) hak='A';
		else if(avg>=80) hak='B';
		else if(avg>=70) hak='C';
		else if(avg>=60) hak='D';
		else hak='F';
		
	}
	
	public String toString() {
		return "\n이름: "+name+"\n총점: "+s+"\n평균: "+avg+"\n학점: "+hak;
	}
}
