package javaBasics;

import java.util.Scanner;

public class learningswitch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter number 1");
		int num1 = scan.nextInt();
		System.out.println("please entet number 2");
		int num2 = scan.nextInt();
		System.out.println("Enter action");
		String act = scan.next();

		switch (act) {

		case "add":
			System.out.println(num1 + num2);
			break;
		case "sub":
			System.out.println("no method found");
			break;
		case "mul":
			System.out.println("no method found for mul");
			break;
		default:
			System.out.println("Invalid action");

		}

	}

}
