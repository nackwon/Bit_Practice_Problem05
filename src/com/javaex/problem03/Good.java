package com.javaex.problem03;

public class Good {

	private String good;
	private int price;
	private int number;

	public Good(String good, int price, int number) {
		this.good = good;
		this.price = price;
		this.number = number;
	}

	public void showInfo() {
		System.out.println(good + "(가격:" + price + "원)이" + number + "개 입고 되었습니다.");
	}
}
