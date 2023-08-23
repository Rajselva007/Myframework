package Practice2.Training;

public class String_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String Immutable
		
		System.out.println("=====================Immutable=================");
	String S = "Trends";
	String S1 = "Institute";
	String S2 = "Trends";
	
	System.out.println(System.identityHashCode(S));
	System.out.println(System.identityHashCode(S1));
	System.out.println(System.identityHashCode(S2));  // Same Memory
	
	S=S+S1;
	System.out.println(S);
	System.out.println(System.identityHashCode(S)); //Memory Change
	
	System.out.println("=====================Mutable=================");
	
	StringBuffer sb = new StringBuffer("Trends");
	StringBuffer sb1 = new StringBuffer("Institute");
	StringBuffer sb2 = new StringBuffer("Trends");

	System.out.println(System.identityHashCode(sb));
	System.out.println(System.identityHashCode(sb1));
	System.out.println(System.identityHashCode(sb2));
	
	sb=sb.append(sb1);
	System.out.println(System.identityHashCode(sb1));
	}

}
