package Practice2.Training;

public class String_to_Numeric {

	
	public static void Str_to_Num(String S)
	{
		for(int i=0; i<S.length();i++)
		{
			char ch = S.charAt(i);
			
			System.out.println(ch+ " " +i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "Selenium";
		
		Str_to_Num(S);
		
	}

}
