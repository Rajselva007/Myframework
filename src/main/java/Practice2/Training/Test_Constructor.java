package Practice2.Training;

public class Test_Constructor {

	public Test_Constructor() {
		System.out.println("Default Constructor");
	}

	public Test_Constructor(int Number) {
		System.out.println("Parameter Constructor " + Number);
	}

	public void Test_Normal() {
		System.out.println("Normal Function");
	}

	public static void main(String[] args) {
		Test_Constructor TC = new Test_Constructor();
		Test_Constructor TC1 = new Test_Constructor(100);
		TC.Test_Normal();
		TC1.Test_Normal();
		TC.Test_Normal();

	}
}
