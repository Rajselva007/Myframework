package Practice2.Training;

import java.util.*;

public class List_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// It is index based

		List<Object> l = new ArrayList<>(); // Upcasting
		l.add("Selva");
		l.add("Sathish");
		l.add("Logesh");
		l.add("Logesh");
		l.add("Logesh");
		l.add("Ganesh");
		l.add("Ganesh");
		l.add("Ganesh");
		l.add(10);
		l.add(10);
		l.add(20);
		l.add(20);
		l.add(30);
		l.add(30);

		l.add("Ganesh");
		System.out.println(l); System.out.println(l.get(2));
		l.add('S'); l.add("Pavi");
		 Set<Object> S = new LinkedHashSet<>(l); // Remove duplicates... Using LinkedHashSet
		System.out.println(S);
		l.set(2, "Nachu"); System.out.println(l);
		
	}

}
