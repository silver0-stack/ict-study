package com.ict.day11;

public class Ex11 {
	private boolean live=true;
	private int age=0;
	private String name=" ";
	
	public Ex11(boolean live, int age, String name) {
		super();
		this.live = live;
		this.age = age;
		this.name = name;
	}
	public boolean isLive() {
		return live;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Ex11 [live=" + live + ", age=" + age + ", name=" + name + "]";
	}
	
	
}
