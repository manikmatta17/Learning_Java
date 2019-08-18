package javaBasics;

import java.util.Scanner;

public class learningscanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter number 1");
		int num1 = scan.nextInt();
		System.out.println("please entet number 2");
		int num2 = scan.nextInt();
		System.out.println("Enter action");
		String act = scan.next();

		if (act.equalsIgnoreCase("Add")) {

			System.out.println(num1 + num2);
		} else {

			System.out.println("method not found");
		}

	}
}
