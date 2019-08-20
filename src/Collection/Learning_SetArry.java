package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Learning_SetArry {

	public static void main(String[] args) {

		Set<Integer> arra1 = new HashSet<Integer>();
		arra1.add(1);
		arra1.add(2);
		arra1.add(3);
		arra1.add(4);
		arra1.add(5);

		Iterator<Integer> itr = arra1.iterator();
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

}
