package MyPack;

public class Arrays {

	public static void main(String[] args) {

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {

				if (i == 0 && j == 3)
					System.out.print("Q  ");

				else if (i == 0 && j == 4)
					System.out.print("K  ");
				else
					System.out.print(".  ");
					
			}
			System.out.println();

		}
	}
}
