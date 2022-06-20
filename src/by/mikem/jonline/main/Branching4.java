package by.mikem.jonline.main;

import java.util.Scanner;

/*
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет 
 * ли кирпич через отверстие.
 */

public class Branching4 {

	public static void main(String[] args) {
		double A;
		double B;
		double x;
		double y;
		double z;

		A = inputConsole("the hole, dimension A");
		B = inputConsole("the hole, dimension B");
		x = inputConsole("the brick, dimension x");
		y = inputConsole("the brick, dimension y");
		z = inputConsole("the brick, dimension z");

		if (x <= A || y <= B) {
			print(true);
		} else if (x <= A || z <= B) {
			print(true);
		} else if (z <= A || y <= B) {
			print(true);
		} else if (x <= B || y <= A) {
			print(true);
		} else if (x <= B || z <= A) {
			print(true);
		} else if (z <= B || y <= A) {
			print(true);
		} else {
			print(false);
		}
	}

	public static void print(Boolean result) {
		if (result) {
			System.out.println("The brick will pass through the hole.");
		} else {
			System.out.println("The brick will not pass through the hole.");
		}
	}

	public static double inputConsole(String variable) {
		double inputConsole;

		inputConsole = inputConsoleUnchecked(variable);

		while (inputConsole < 0) {
			inputConsole = inputConsoleUnchecked(variable);
		}

		return inputConsole;
	}

	public static double inputConsoleUnchecked(String variable) {
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
