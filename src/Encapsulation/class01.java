package Encapsulation;

public class class01 {

	private String name;
	private int age;

	public void setname(String str) {

		this.name = str;

	}

	public void setage(int num) {
		this.age = num;

	}

	public String getname() {

		return name;
	}

	public int getage() {

		return age;
	}

	private void admissionprocess() {

		System.out.println("admission process");

	}

	public void enroll() {

		admissionprocess();

	}
}
