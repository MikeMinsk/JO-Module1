package by.mikem.jonline.main;

import java.util.Scanner;

/*
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 */

public class Cycles2 {

	public static void main(String[] args) {
		double a;
		double b;
		double h;
		double x;
		double y;

		a = inputConsole("a");
		b = inputConsole("b");
		while (a >= b) {
			System.out.println("Please, enter correct values.");
			a = inputConsole("a");
			b = inputConsole("b");
		}

		h = inputConsole("h");
		while (h <= 0) {
			System.out.println("Please, enter correct value.");
			h = inputConsole("h");
		}

		x = a;

		System.out.print("Founded function values: ");

		while (x <= b) {
			if (x > 2) {
				y = x;
				x += h;
			} else {
				y = -x;
				x += h;
			}
			System.out.print(y + "; ");
		}
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
