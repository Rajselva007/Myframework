package Practice2.Training;

public class Student_Details {

	private void Student(int ID) {
		System.out.println("Student ID is " + ID);
	}

	private void Student(String Name, String Class, char Section) {
		System.out.println("Student Name is " + Name + " and Class is " + Class+" and Section is "+Section);
	}

	private void Student(int Mark, double GPA) {
		System.out.println("Student Mark is " + Mark + " and GPA " + GPA);
	}
	
	public static void main(String args[]) {
		Student_Details S = new Student_Details();
		S.Student(419109);
		S.Student("Selva", "Selenium", 'B');
		S.Student(786, 74.560);
		
	}

}
