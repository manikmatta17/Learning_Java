package Collection;

import java.util.ArrayList;
import java.util.List;

public class Learning_ArrList {

	public static void main(String[] args) {

		List<String> arr = new ArrayList<String>();
		arr.add("Manik");
		arr.add("Matta");
		System.out.println(arr.get(0));

		for (int i = 0; i < arr.size(); i++) {

			System.out.println(arr.get(i));
		}

	}

}
