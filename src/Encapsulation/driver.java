package Encapsulation;

public class driver {

	public static void main(String[] args) {

		class01 enc = new class01();
		enc.setage(5);
		enc.setname("manik");

		System.out.println(enc.getage());
		System.out.println(enc.getname());

		enc.enroll();

	}

}
