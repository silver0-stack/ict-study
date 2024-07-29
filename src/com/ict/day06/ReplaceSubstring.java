package com.ict.day06;

public class ReplaceSubstring {
	public static void main(String[] args) {
		// 문자열 배열: {"Hello", "World", "Java", "ICT", "Korea"}
		// 주어진 문자열 배열에서 "Java"가 시작하는 인덱스를 찾고, 이 부분 문자열을 "Python"으로 교체하는 코드를 작성해 보세요.
		/* indexOf는 문자열이랑 리스트에선 사용 가능한데 왜 배열에선 사용 불가능한지*/
		String arr= "Hello, Java";
		int index=arr.indexOf("Java");
		System.out.println("Java는 Hello, Java에서 "+index+" 인덱스에 있습니다.");
		arr=arr.replace("Java", "Python");
		System.out.println(arr);
	}
}
