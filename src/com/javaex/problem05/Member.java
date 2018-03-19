package com.javaex.problem05;

public class Member {

	private String name;
	private String phone_p;
	private String phone_c;

	public Member() {

	}

	public Member(String name, String phone_p, String phone_c) {
		this.name = name;
		this.phone_p = phone_p;
		this.phone_c = phone_c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_p() {
		return phone_p;
	}

	public void setPhone_p(String phone_p) {
		this.phone_p = phone_p;
	}

	public String getPhone_c() {
		return phone_c;
	}

	public void setPhone_c(String phone_c) {
		this.phone_c = phone_c;
	}

	@Override
	public String toString() {
		return "이름: " + name + "\n핸드폰: " + phone_p + "\n회사: " + phone_c;

	}

}
