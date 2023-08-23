package Practice2.Training;

public class OverRide_Demo2 extends OverRide_Demo1 //we can using data's Override_Demo1 with Extense keyword
{

	
	//Method override we can over ride methods data without changing any parameter
	
	//Different class name and same method & parameter
	
@Override
public void form(String Name, int Age, String Add) {
	super.form(Name, Age, Add);
String State = "TamilNadu";

System.out.println("State :"+State);
}	

public static void main(String args[])
{

	OverRide_Demo2 D2=new OverRide_Demo2();
	D2.form("Selva", 30, "Triplicane, Chennai");
}

}

