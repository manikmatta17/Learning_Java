package Abstract;

public abstract class abstractclass {

	public double slab = 10;

	public abstract void taxslab();

	public abstract void test();

	public void taxcalculator(double amount) {

		System.out.println("toal tax=" + (amount * slab / 100));

	}
}
