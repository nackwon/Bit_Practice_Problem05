package com.javaex.problem02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Friend> array = new ArrayList<Friend>();
		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해 주세요.");

		for (int i = 0; i < 3; i++) {

			String str = sc.nextLine();
			Friend friend = new Friend(str.split(" ")[0], str.split(" ")[1], str.split(" ")[2]);
			array.add(friend);

		}

		for (int i = 0; i < 3; i++) {
			array.get(i).showInfo();
		}
	}

}
