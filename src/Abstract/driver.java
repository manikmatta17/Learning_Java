package Abstract;

public class driver {

	public static void main(String[] args) {

		basicslab bs = new basicslab();
		bs.taxslab();
		bs.taxcalculator(4000);

		medium ms = new medium();
		ms.taxslab();
		ms.taxcalculator(5000);
	}

}
