package Practice2.Training;

public class Pattern_Prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j + "");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}

			System.out.println();

			for (int l = 5; l >= 1; l--) {

				for (int k = 5; k <= l; k++) {
					System.out.print(" ");
				}

				for (int m = 5; m <= l; m++) {

					System.out.print(m + "");
				}
				System.out.println();

			}

		}

	}
}
