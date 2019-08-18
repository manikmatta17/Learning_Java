package javaBasics;

public class driver {

	public static void main(String[] args) {

		class01 cl = new class01();
		cl.sum();
		class01.delete();

		class02 c2 = new class02();
		System.out.println(c2.sum());

		System.out.println(class02.del());
		System.out.println(class02.del());
		System.out.println(class02.del());

		System.out.print(class02.del());
		System.out.print(class02.del());
		System.out.print(class02.del());

	}

}
