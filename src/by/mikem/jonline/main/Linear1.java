package by.mikem.jonline.main;

import java.util.Scanner;

/*
 * Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 */

public class Linear1 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double z;

		a = inputConsole("a");
		b = inputConsole("b");
		c = inputConsole("c");

		z = ((a - 3) * b / 2) + c;

		System.out.println("z = ( (a - 3 ) * b / 2) + c = " + z);
	}

	public static double inputConsole(String variable) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a value for " + variable + " >> ");

		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Enter a value for " + variable + " >> ");
		}

		return sc.nextDouble();
	}
}
