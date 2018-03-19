package com.javaex.problem05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PhoneApp {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream("D:\\javaStudy\\file\\phoneDB.txt")));

		//Scanner sc = new Scanner(System.in);
		String str = "";
		List<Member> list = new ArrayList<Member>();
		while (true) {
			str = br.readLine();
			if (str == null) {

				break;
			}
			StringTokenizer st = new StringTokenizer(str, ",");
			Member member = new Member(st.nextToken(), st.nextToken(), st.nextToken());
			list.add(member);
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
			System.out.println();
		}
	}
}
