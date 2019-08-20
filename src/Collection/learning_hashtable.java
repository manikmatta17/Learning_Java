package Collection;

import java.util.Hashtable;

public class learning_hashtable {

	public static void main(String[] args) {

		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("Manik", "AGL");
		ht.put("Matta", "infosys");
		ht.put("Manik", "Hewitt");

		ht.remove("Manik");
		System.out.println(ht.get("Manik"));
		System.out.println(ht.get("Matta"));

	}

}
