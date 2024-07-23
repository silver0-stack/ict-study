package com.ict.dayo6;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		String str="강남 한국 ICT 인재개발원 4층 1강의실";
		
		/* 1. charAt(int index) : char
		 * 지정된 인덱스에 있는 문자 반환
		 * */
		char c1=str.charAt(4);
		System.out.println(c1);
		System.out.println();
		
		// 소문자를 대문자로 변경( 대문자 = 소문자 -32)
		str="i love you 3000";
		for(int i=0;i<str.length();i++) {
			//System.out.println(str.charAt(i));
			char ch=str.charAt(i);
			if(ch>='a'&& ch<='z') {
				ch=(char)(ch-32);
			}
		
			
		}
		
		/* 2. length() : int 
		 * 문자열의 길이 반환
		 * 0이 아닌 1부터 시작
		 * */
		String hlwrld="Hello, World";
		int len=hlwrld.length();
		System.out.println(len); // 12
		
		
		/* 3. substring(int beginIndex, int endIndex : String
		 * !!!! 자바는 endIndex는 항상 포함 안함!!!!!
		 * 문자열의 특정 부분을 추출하여 새 문자열을 반환한다
		 * DB에 저정된 유저의 정보 입력 시간: 연월일시분초를 출력할 때 연-월-일만 출력하고 싶을 때 substring 많이 씀*/
		// TODO (,12)가 왜 가능한지 모르겠음 마지막 인덱스는 11인데 어떻게 하나를 더한 12인덱스 호출이 가능한건지 의문
		// (, 13) 을 호출하면 java.lang.StringIndexOutOfBoundsException 에러 뜸
		String sub=hlwrld.substring(7,12);
		System.out.println(sub);
		
		
		
		
		/* 4. indexOf(String substring) : int 
		 * 문자열에서 특정 부분 문자열이 ***처음으로*** 나타난 위치의 인덱스 반환*/
		System.out.println();
		int index=hlwrld.indexOf("World");
		System.out.println(index);
		
		
		/* 5. contain(CharSequence sequence) : boolean
		 * 문자열이 특정 문자열을 포함하고 있는지 확인한다*/
		String eml="nojm73@gmail.com";
		boolean contains=eml.contains("@") && eml.contains(".");
		System.out.println(contains);
		
		System.out.println();
		
		
		/* 6. replace(CharSequence target, CharSequence replacement) : String
		 * 문자열에서 특정 문자열을 다른 문자열로 교체한다*/
		String curse="안녕 내 이름은 최은영이야";
		boolean cursed_=curse.contains("안녕") && curse.contains("최은영");
		String replaced="";
		if(cursed_) {
			replaced=curse.replace("안녕", "hi");
			replaced=replaced.replace("최은영", "Eun young Choi");
		}
		System.out.println(replaced);
		
		System.out.println();
		
		// 전화번호 표준규격-DB 저장
		String num="010-9797-1110";
		String num_=num.replace("-", "");
		System.out.println(num_);
		
		System.out.println();
		
		System.out.println("****************");
		// 전화번호 마지막 4자리 별자리 치환
		// 이름 중간 별자리 치환
		// 주민번호 마지막 7자리 별자리 치환
		// 유저 비밀번호 모름. 암호화해서 저장함. 디코딩도 안되는 암호를 씀
		// 관리자도 보안법 상 회원 개인정보를 완전하게 저장할 수 없다
		String str6="****";
		// 전번의 뒤 4자리를 별인 str3로 치환해라
		System.out.println(num.replace(num.substring(9), str6));
		
		System.out.println();
		
		String str7="*";
		String name="최은영";
		System.out.println(name.replace(name.substring(1,2), str7));
		
		
		
		// TODO 이름이 4개나 5개이든 앞글자 뒤글자 빼고 나머지 별자리 치환
		String name_="남궁선선선우";
		System.out.println(name_.replace(name_.substring(1,name_.length()-1), str7.repeat(name_.length()-2)));
		
//		for(int i=; i<name_.length(); i++) {
//			
//		}
//		
		System.out.println("****************");
		
		/* 7. toUpperCase() toLowerCase() : String
		 * 문자열을 대문자 혹은 소문자로 변환한다*/
		String str2="Hello World";
		System.out.println(str.toUpperCase()); // HELLO WORLD
		System.out.println(str.toLowerCase()); // hello world
		
		/* 8. trim() : String
		 * trim은 "다듬다", "손질하다","잘라내다" 라는 뜻
		 * 데이터에서 불필요한, 여기선 "공백" 제거하는데 사용되는 함수다
		 * 문자열의 앞뒤 공백을 제거한다*/
		String str3=" Hello World ";
		System.out.println(str3.trim()); // Hello World
		
		System.out.println();
		
		/* 9. split(String regex) : String[]
		 * regex 는 regular expression (정규 표현식)
		 * split(String regex, int limit) : String[]
		 * regex 는 구분자, limit은 배열의 수 지정
		 * 문자열을 주어진 정규 표현식을 기준으로 분할하여 문자열 배열로 반환한다
		 * */
		String str4="Hello,World,Java";
		String[] words=str4.split(",");
		System.out.println(Arrays.toString(words)); // ["Hello", "World", "Java"]
		
		System.out.println();
		
		
		String[] split_num=num.split("-",2);
		System.out.println(Arrays.toString(split_num)); // [010, 9797-1110]
		System.out.println();
		
		// 가능한 배열 크기가 넘어가면 남은 인덱스는 사라진다
		String[] split_num2=num.split("-",4);
		System.out.println(Arrays.toString(split_num2)); // [010, 9797, 1110]
		System.out.println();
		
		
		
		/* 11. startsWith(String prefix) : boolean
		 * 문자열이 특정 문자열로 시작하는지 확인한다*/
		System.out.println(hlwrld.startsWith("H"));
		
		
		/* 12. endsWith(String suffix) : boolean
		 * 문자열이 특정 문자열로 끝나는지 확인한다
		 * .jpg 인지 .mp4 인지 확인해서 분류 가능하다*/
		System.out.println(hlwrld.endsWith("e"));
		
		
		System.out.println();
		
		
		/* 13. concat(String str) :String
		 * 현재 문자열과 입력된 문자열을 더한다
		 * ("문자열" + "문자열")*/
		String s1="대한민국 ";
		String s2=s1 + "파이팅";
		System.out.println(s2);
		
		String s3=s1.concat("파이팅");
		System.out.println(s3);
		
		/* 14. equals(Object object) : boolean
		 * Object object => String
		 * 대소문자 구분 함!!!
		 * 입력된 문자열과 현재문자열의 내용 같으면 true 아니면 false
		 * String의 같다 라는 비교는 숫자처럼 == 를 사용하지 않는다
		 * 주소가 같냐고 물어보는 거임. String 원 변수와 String 복사변수는 equals() false 임*/
		String s4="korea";
		String s5="KOREA";
		
		boolean isEqual=s4.equals(s5);
		System.out.println(isEqual); // false
		
		
		/* 15. equalsIgnoreCase(String anotherString) : boolean
		 * 대소문자 구분 안함 (y,n OR Y,N)
		 * */
		isEqual=s4.equalsIgnoreCase(s5);
		System.out.println(isEqual); //true
		
		
		/* 16. format(String format, Object... args)
		 * 형식을 지정하면 형식에 맞게 문자열 생성
		 * @@님 회원가입을 축하합니다 같은 일괄적으로 발송하는 알림 노티 등에 특화적임
		 */
		
		String s7="한국 ICT 인재 개발원";
		// %s => 문자열
		
		String s8=String.format("@@ %s !! 파이팅", s7);
		System.out.println(s8);
		
		
		// %30s => 30 자리 차지하는 문자열(남은 자리는 비워둔다) 오른쪽 정렬
		String s9=String.format("%30s", s7);
		System.out.println(s9);
		
		// -는 왼쪽 정렬
		String s10=String.format("%-30s", s7);
		System.out.println(s10);
		
		// 문자열의 길이보다 작으면 어떻게 될까?
		// 작아도 글자 수 만큼 확장됨
		String s11=String.format("%6s", s7);
		System.out.println(s11);
		
		// %d 정수 형식
		int k=2134;
		String s12=String.format("%d 번고객님, 회원가입읕 축하드립니다!", k);
		System.out.println(s12);
		
		// 뒤에서 부터 정렬됨
		String s13=String.format("%10d 번고객님, 회원가입읕 축하드립니다!", k);
		System.out.println(s13);
		
		// 크기 모자라도 다 출력됨
		String s14=String.format("%2d 번고객님, 회원가입읕 축하드립니다!", k);
		System.out.println(s14);
		
		
		// %f 실수형식 : 소수점을 지정하면 반올림 처리된다
		// 하지만 정확한 값은 떨어짐
		// 따라서 케이스마다 결괏값이 달라지기 때문에 지양해야 할 메소드이다.
		// 리턴값이 String이라 연산은 따로 안되고 그냥 출력용이다.
		double s16=123.456789;
		String s17=String.format("%f", s16);
		System.out.println(s17);
		
		// 소수점 첫째자리까지 구해짐!!!!
		String s18=String.format("%.1f", s16);
		System.out.println(s18);
		
		// 소수점 셋째자리까지 구해짐!!!!
		// 반올림 됨
		String s19=String.format("%.3f", s16);
		System.out.println(s19);
		
		System.out.println();
		
		/* 17. getBytes() : byte[]
		 * 해당 문자열을 byte[] 로 반환한다. => 입출력(IO) Stream 에 사용된다.
		 * byte 는 영어 대소문자, 숫자, 일부 특수문자를 숫자로 표현
		 * 파일 입출력이나 네트워크 통신에서 유용하게 사용됨
		 * 단점은 영어를 제외한 나머지 글자는 적용 안됨
		 * getBytes() 메소드는 시스템의 기본 문자셋을 사용하여 문자열을 바이트 배열로 변환한다
		 * 만약 특정 문자셋, 이를테면 UTF-8 문자셋을 사용하려면 getBytes(Charset charset) 메소드를 사용할 수 있다
		 * getBytes(Charset charset) 을 사용하면 된다
		 *  => */
		String s20="java";
		byte[] b1=s20.getBytes();
		
		for(int i=0; i<b1.length ;i++) {
			System.out.println(b1[i]+ " : "+(char)(b1[i]));
		}
		System.out.println();
		
		for(byte b: b1) {
			System.out.println(b);
		}
		
		System.out.println("======================================");
		
		

		/* 17-1. toCharArray() : Char[]
		 * 해당 문자열을 Char[]로 반환 => 입출력 스트림에 사용된다
		 * 영어 대소문자, 숫자 뿐만 아니라 전 세계문자도 가능하다*/
		String s21="ICT 인재개발원 2 Center";
		char[] ch=s21.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		
		
		/* 18. indexOf(int ch), indexOf(String str) : int
		 * 입력된 문자(ch), 문자열(str) 의 첫번째 위치값을 알려준다.
		 * 문자나 문자열이 없으면 -1 반환된다
		 * */
		String s22="BufferedReader";
		int n1=s22.indexOf('e');
		System.out.println("첫번째 e의 인덱스: "+n1);
		
		int n2=s22.indexOf("er");
		System.out.println("첫번째 er의 인덱스: "+n2);
		
		// 존재하지 않는 String 이기에 -1 반환
		int n3=s22.indexOf("err");
		System.out.println("첫번째 er의 인덱스: "+n3);
		
		
		
		
		/* 19. indexOf(int ch, int fromIndex), indexOf(String str, int fromIndex) : int
		 * fromIndex => 시작위치
		 * fromIndex를 이용하면 2번째, 3번째 문자나 글자를 찾을 수 있다*/
		
		// 일단 첫번째를 찾자
		int n4=s22.indexOf("e"); // 4
		int n5=s22.indexOf("e",n4+1); // n4 인덱스 다음 인덱스부터 "e"를 찾아라		
		System.out.println("두번째 e의 인덱스: "+n5); // 6
		
		
		
		/* 20. lastIndexOf(int ch), lastIndexOf(String str) : int
		 * 마지막 문자나 문자열의 위치를 찾을 때 사용한다
		 * */
		int n6=s22.lastIndexOf("e");
		System.out.println("마지막 e의 인덱스: "+n6); //12
		
		
		
		/* 21. toString : String
		 * 모든 클래스(Object)에 toString 존재
		 * 객체(클래스)가 가지고 있는 정보나 데이터(값)들을
		 * 문자열로 만들어서 반환하는 메소드
		 * String 클래스에서는 문자열 자체를 반환한다
		 * 객체 상태를 문자열로 표현하는데 매우 유용하기 때문에 문자열에 이용할 필욘 X*/
		
		
		System.out.println();
		
		/* 22. valueOf(모든 자료형)
		 * 모든 자료형을 String 으로 변환한다
		 * toString() 이랑 결과적으로 같은 출력이 된다.
		 * */
		int a=1;
		double b=1.22;
		boolean bool=true;
		
		// 자바에서 + 연산자는 두 피연산자 중 하나가 문자열인 경우, 다른 피연산자를 문자열로 변환하고 두 문자열을 연결합니다.
		System.out.println(a+1);
		System.out.println(String.valueOf(b)+1);
		System.out.println(String.valueOf(bool)+1);
		
		// 실제 자료형에 +1을 한다.
		System.out.println(bool+"1");
		System.out.println(String.valueOf(bool)+"1");
		System.out.println(a+1);
		System.out.println(b+2);
		
		
		
		/* 23. Wrapper 클래스
		 * 기본 자료형을 객체로 만들 때 사용하는 클래스
		 * 기본자료형의 형태를 가진 문자열을 해당 자료형으로 변경시키는 클래스
		 * 	23-1. Boolean 클래스 : "true" 나 "false"를 true, false로 만듦
		 * 						 "true"를 제외한 String을 다 false로 만듦 */
		String str8="true";
		boolean str9=Boolean.parseBoolean(str8);
		System.out.println(str8+1); // 자바에서 + 연산자는 두 피연산자 중 하나가 문자열인 경우, 다른 피연산자를 문자열로 변환하고 두 문자열을 연결한다
		//System.out.println(str9+1);  // str9가 String이 아닌 boolean 이기에 int 형과 + 연산자 불가능하다
		
		System.out.println(str8 );
		System.out.println(str9 ); // false -> 
//		if(str8) {}
//		if(str9) {}
		
		/*	23-2. Integer 클래스: 정수 형태의 문자열("10", "2145")을 int형으로 변경시키는 클래스
		 * */
		String str10="120";
		int str11=Integer.parseInt(str10);
		System.out.println(str10+1); //1201 : 자바는 피연산자 중 하나가 문자열이면 다른 피연산자도 문자화돼서 이어서 출력된다
		System.out.println(str11+1); //121
		
		System.out.println();
		
		/* 23-3. Long 클래스: 정수 형태의 문자열("10", "2145")을 long 형으로 변경시키는 클래스
		 * */
		String str12="120";
		long str13=Long.parseLong(str12);
		System.out.println(str10+100); //120100 
		System.out.println(str11+100); //220
		
		
		System.out.println();
		/* 23-4. Float 클래스: 실수형태의 문자열("234.12")을 float 형으로 변경시키는 클래스*/
		String str5="123.457";
		float num2=Float.parseFloat(str5);
		System.out.println(str5+123.159); // 123.457
		System.out.println(num2+123.159); // 135.457
		
		
		System.out.println();
		/* 23-5. Double 클래스: 실수형태의 문자열("234.12)를 double 형으로 변경시키는 클래스 */
		String str14="123.457";
		double num3=Double.parseDouble(str5);
		System.out.println(str5+12.159); // 123.457
		System.out.println(num2+123.159); // 135.457
		System.out.println();
		
		
		/*b23-6. Character 클래스: Character.parseCharacter() 는 존재하지 않는다
		 * String 클래스의 charAt()을 사용하면 char를 만들 수 있다*/
		String str15="G";
		char str16=str15.charAt(0);
		System.out.println(str15+1); //G1
		System.out.println(str16+1); //저장된 숫자와 1을 더하니 72 출력됨
		System.out.println((char)(str16+1));  //72를 숫자로 바꾼 H 출력됨
		
	}
	
}
