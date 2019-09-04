package Inheritence;

public class ToolSelenium extends AutomationTesting {

	public void opensource() {

		System.out.println("its a Open source");

	}

	public ToolSelenium() {

		System.out.println("Tool Selenium constructor - Child");
	}

	public static void MobileAutomation() {

		System.out.println("It perform Mobile Autoamtion");
	}

	public void Regression() {

		super.Regression();
		
		
		System.out.println("Regression testing from Tool Selenium-Child");

	}

}
