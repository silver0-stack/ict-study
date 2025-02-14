package com.ict.day01;

/* 
 주석 : 컴파일러가 무시하고 지나가는 줄 그래서 컴퓨터는 못보고 사람만 봄
 다른 개발자나 자기에게 멘트를 남길 때 사용
*/

/* 
 저장이름 = 자바파일이름 = 클래스이름
 클래스이름 무조건 첫글자 영문자 대문자
*/

/* 
 여기서 클래스 Ex01, String, System 총 3개 중 String, System 은 회사에서 제공한 클래스파일을 사용한 거.
 이를 우리는 API를 사용했다 라고 한다(레고블럭)
*/
public class Ex01 {
	/* 
	 ()가 보이면 무조건 메소드이다.
	 클래스 안에는 메소드, 필드, 생성자 3개가 존재한다.
	 메서드는 실행, 동작하는 것이다.
	 필드는 데이터, 값을 의미한다.
	 필드에는 중간에 데이터를 변경해도 되는 것(변수)과
	 변경하면 안되는 것(상수)이 있다.
	 모든 글자가 대문자로 이루어지면 상수
	 소문자로 시작하는 것은 변수와 메소드
	 */
	
	/* 
	 main 메소드 = 프로그램 시작점, JVM이 해석과 실행을 위해서 호출한다
	*/
	public static void main(String[] args) {
		// 클래스 뒤에서 shift + F2 => 
		System.out.println("Hello, Java");
		System.out.println("이름: 최은영");
	}
}
