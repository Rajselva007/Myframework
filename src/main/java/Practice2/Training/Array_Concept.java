package Practice2.Training;

public class Array_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int i=10; // Global Declaration
	
	int a[] = new int[5];  // int Array Declaration (Array is collection of objects) - Single declaration
	
	a[0] = 10;
	a[1] = 20;
	a[2] = 30;
	a[3] = 40;
	a[4] = 50;
	
	String[] b = {"Selva", "Sathish", "Logesh", "Ganesh", "Arun"}; // String Array Declaration - Multiple Declaration
	
	System.out.println(a); // It will print only memory allocation... not value
	
	System.out.println(a[3]); // Getting single values
	
	
	for(int j=0;j<a.length;j++) // Getting All values
	{
	System.out.println(a[j]);	
	}
	
	for(String Str : b) // Using forEach
	{
		System.out.println(Str);
	}
	
	for(int Value : a) // Using forEach
	{
		System.out.println(Value);
	}
	}

}
