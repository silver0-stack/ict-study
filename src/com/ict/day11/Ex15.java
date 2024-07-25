package com.ict.day11;

public class Ex15 {
	private String name="링고";
	private int age=24;
	private double height=17;
	
	public Ex15() {
		System.out.println("기본생성자~");
		// 기본생성자에서 객체 생성하면서 필드를 아예 다시 설정할 수 있는거다.
		this.name="퀸링고";
	}
	
	@Override
	public String toString() {
		return "Ex15 [name=" + name + ", age=" + age + ", height=" + height + "]";
	}

	public Ex15(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
}
