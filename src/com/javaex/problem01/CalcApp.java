package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(">>");
			String cal = sc.nextLine();
			if (cal.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			}

			int n1 = Integer.valueOf(cal.split(" ")[0]);
			int n2 = Integer.valueOf(cal.split(" ")[2]);
			String calcurate = cal.split(" ")[1];

			if ("+".equals(calcurate)) {
				Add add = new Add();
				add.setValue(n1, n2);
				System.out.println(add.calculate());
			} else if (calcurate.equals("-")) {
				Sub sub = new Sub();
				sub.setValue(n1, n2);
				System.out.println(sub.calculate());
			} else if (calcurate.equals("*")) {
				Mul mul = new Mul();
				mul.setValue(n1, n2);
				System.out.println(mul.calculate());
			} else if (calcurate.equals("/")) {
				Div div = new Div();
				div.setValue(n1, n2);
				System.out.println(div.calculate());
			} else
				System.out.println("알 수 없는 연산입니다.");
		}
	}
}
