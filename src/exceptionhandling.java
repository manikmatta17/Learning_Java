
public class exceptionhandling {

	public static void main(String[] args) {

		System.out.println("execution started");

		int a = 6;
		int b = 0;
		int c = 0;
		try {
			c = a / b;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {

			System.out.println("I am final");
		}
		System.out.println(c);
		System.out.println("Execution completed");

	}

}
