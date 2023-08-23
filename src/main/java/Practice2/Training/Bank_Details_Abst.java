package Practice2.Training;

public class Bank_Details_Abst extends Bank_Abstract {

	@Override
	public void HomeLoan() {
		System.out.println("8%");
	}

	@Override
	public void EducationLoan() {
System.out.println("7%");		
	}

	public static void main(String[] args) {
		Bank_Details_Abst B = new Bank_Details_Abst();
		B.HomeLoan();
		B.EducationLoan();
		B.personalLoan();
	}

}
