package Practice2.Training;

public class Bank_Details_Interface implements Bank_Interface {

	
	@Override
	public void PersonalLoan() {
		System.out.println("11%");
	}

	@Override
	public void HomeLoan() {
		System.out.println("8%");		
	}

	@Override
	public void EducationLoan() {
		System.out.println("7%");		
	}

public static void main(String[] args) {
		
	Bank_Details_Interface B1 = new Bank_Details_Interface();
	
	B1.PersonalLoan();
	B1.HomeLoan();
	B1.EducationLoan();
	
	}

}
