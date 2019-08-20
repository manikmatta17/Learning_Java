package Collection;

import java.util.Hashtable;

public class NestedHashTable {

	public static void main(String[] args) {

		Hashtable<String, String> ht1 = new Hashtable<String, String>();
		ht1.put("Name", "Manik");
		ht1.put("SirNAme", "Matta");

		Hashtable<String, String> ht2 = new Hashtable<String, String>();
		ht1.put("Location1", "Noida");
		ht1.put("Location2", "Melbourne");

		Hashtable<String, Hashtable<String, String>> ht3 = new Hashtable<String, Hashtable<String, String>>();
		ht3.put("Hero", ht1);
		ht3.put("City", ht2);

		System.out.println(ht3.get("Hero").get("Name"));

	}

}
