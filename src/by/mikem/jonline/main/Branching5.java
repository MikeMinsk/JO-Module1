package by.mikem.jonline.main;

import java.util.Scanner;

/*
 * Вычислить значение функции:
 */

public class Branching5 {

	public static void main(String[] args) {
		double x;
		double y;

		x = inputConsole("x");

		if (x <= 3) {
			y = Math.pow(x, 2) - 3 * x + 9;
		} else {
			y = 1 / (Math.pow(x, 3) + 6);
		}

		System.out.println("F(x) = " + y);
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
