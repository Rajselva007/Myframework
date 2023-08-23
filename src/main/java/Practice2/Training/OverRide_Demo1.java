package Practice2.Training;

public class OverRide_Demo1 {

	public void form(String Name, int Age, String Add) 
	{

	System.out.println("Name :"+ Name);
	System.out.println("Age :"+ Age);
	System.out.println("Address is : "+Add);
		
	}

public static void main(String Args[])
{
OverRide_Demo1 D1 = new OverRide_Demo1();
D1.form("Selva", 30, "Triplicane, Chennai");

}
}
