package MyPack;

import java.util.Scanner;

public class Gun {

	public static void main(String[] args) {
		System.out.println("Enter an integer to check if it's prime or not");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		boolean flag = false;

		int i = 2;
		while (i <= x / 2) {
			if (x % i == 0) {
				flag = true;
				break;
			}i++;
		}

		if (flag)
			System.out.println("The number is Non Prime");
		else
			System.out.println("The number is Prime");

	}
}
