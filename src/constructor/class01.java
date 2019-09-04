package constructor;

public class class01 {

//	public static int num1 = 10;
//	public static int num2 = 20;
	public static int res;
	public static int num1;
	public static int num2;
	public static int num3;

	public class01() {

		System.out.println("Default constructor");
	}


	public class01(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;

		System.out.println("Default constructor called");

	}
	
	
	public class01(int num1, int num2,int num3) {
		this.num1 = num1;
		this.num2 = num2;

		System.out.println("Default constructor called");

	}

	public static void sum() {

		System.out.println("Result of sum is" + (num1 + num2));
	}
	
	public static void sum(int a) {

		System.out.println("Result of sum is" + (num1 + num2));
	}
	
	
	public static void sum(int a, int b) {

		System.out.println("Result of sum is" + (num1 + num2));
	}

	public static void div() {

		System.out.println("Result is" + (num1 - num2));
	}

}
