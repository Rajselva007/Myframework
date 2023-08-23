package Practice2.Training;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Collection <Object> C = new ArrayList<Object>();
		
		C.add("Mobile");
		C.add("Charger");
		C.add("Connected");
		
		for(Object obj : C)
		{
			System.out.println(obj);
		}
	}

}
