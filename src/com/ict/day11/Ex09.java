package com.ict.day11;

public class Ex09 {
	// private 필드라 메소드를 이용해 접근할 수 있다. 그래서 getter/setter 만들어준거임
	private String name="홍길동";
	private int age=24;
	private boolean gender=true;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/* boolean 필드의 getter 메소드명은 isXXX() 으로 만들어짐 */
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
}
