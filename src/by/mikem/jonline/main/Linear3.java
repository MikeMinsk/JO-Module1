package by.mikem.jonline.main;

import java.util.Scanner;

/*
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 */

public class Linear3 {

	public static void main(String[] args) {
		double x;
		double y;
		double result;

		x = inputConsole("x");
		y = inputConsole("y");

		if ((Math.cos(x) + Math.sin(y)) == 0) {
			System.out.println("Result: dividing by zero! Enter another values.");
		} else {
			result = Math.tan(x * y) * (Math.sin(x) + Math.cos(y)) / (Math.cos(x) + Math.sin(y));
			System.out.println("Result: " + result);
		}

	}

	public static double inputConsole(String variable) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a value for " + variable + " in radian >> ");

		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Enter a value for " + variable + " in radian >> ");
		}

		return sc.nextDouble();
	}
}
