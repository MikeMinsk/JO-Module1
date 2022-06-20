package by.mikem.jonline.main;

import java.util.Scanner;

/*
 * Найти max{min(a, b), min(c, d)}.
 */

public class Branching2 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double result;

		a = inputConsole("a");
		b = inputConsole("b");
		c = inputConsole("c");
		d = inputConsole("d");

		result = Math.max(Math.min(a, b), Math.min(c, d));

		System.out.print("max{min(a, b), min(c, d)} = " + result);
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
