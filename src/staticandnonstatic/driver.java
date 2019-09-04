package staticandnonstatic;

public class driver {

	public static void main(String[] args) {

		calculator.sum();

		calculator cal = new calculator();
		cal.div();
		cal.sum();

	}

}
