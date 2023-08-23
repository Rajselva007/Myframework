package Practice2.Training;

import java.util.*;
import java.util.Map.Entry;



public class Map_Demo {

	public static void main(String Args[]) {

		Map<Integer, String> m = new HashMap<>();

		m.put(1, "Selva"); // Using Put();
		m.put(2, "Pavi");
		m.put(3, "Maganth");

		System.out.println(m);
		System.out.println(m.get(3)); // Using Get();

		Set<Integer> keyset = m.keySet();
		System.out.println("Keyset: "+ keyset); //Using keySet();
		
		Collection<String> values = m.values(); //Using values();
		
		System.out.println("Values :" + values);
		
		Set<Entry<Integer, String>> entrySet = m.entrySet(); // Using entrySet();
		
		for(Entry<Integer, String> entry : entrySet)
		{
			System.out.println(entry);
		}
		
int size = m.size();
System.out.println("Size of Map :" +size);
boolean containsKey = m.containsKey(2);
System.out.println("Contains Key :"+ containsKey); // Using containsKey();

boolean containsValue = m.containsValue("Pavi");

System.out.println("Contains Values :" + containsValue); // Using containsValue();

	}
}
