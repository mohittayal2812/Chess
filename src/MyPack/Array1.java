package MyPack;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {

		String[] userRegister = { "Register", "register" };

		System.out.println("Welcome! You want to login or register?");
		Scanner rl = new Scanner(System.in);
		String y = rl.nextLine();

		if (y.equals(userRegister[0]) || y.equals(userRegister[1])) {

			System.out.println("To Register Please Folllow The Steps. \n");
			System.out.println("Create a new Username :");
			Scanner u1 = new Scanner(System.in);
			String q = u1.nextLine();

			System.out.println("Create a new Password :");
			Scanner p1 = new Scanner(System.in);
			String w = p1.nextLine();

			System.out.println("Re-enter your Password :");
			Scanner p2 = new Scanner(System.in);
			String e = p2.nextLine();

			if (e.equals(w)) {
				System.out.println("\nMatched");
				System.out.println("\nYou are successfuly registered.");
			} else {
				System.out.println("\nUnMatched");
				System.out.println("\nPlease try again..!!");
			}
		}

		else {
			String[] userMahima = { "Mahima", "mahima", "10" };
			String[] userMohit = { "Mohit", "1234", "1" };

			System.out.println("Enter Username : ");
			Scanner sc = new Scanner(System.in);
			String x = sc.nextLine();
			System.out.println("Enter Password : ");
			Scanner ps = new Scanner(System.in);
			String i = ps.nextLine();

			if (x.equals(userMahima[0]) && i.equals(userMahima[1])) {
				System.out.println("\n \nWelcome Admin!");
			} else if (x.equals(userMohit[0]) && i.equals(userMohit[1])) {
				System.out.println("\n \nWelcome Mohit!");
			} else {
				System.out.println("\n \nUnauthorized access");
			}
		}
	}
}
