package com.ict.day11;

public class Ex05 {
	private String name = "";
	private int price = 0;

	public Ex05(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ex05 [name=" + name + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

}
