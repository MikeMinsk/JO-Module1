package by.mikem.jonline.main;

import java.util.Scanner;

/*
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 */

public class Linear2 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double intermediateResult;
		double result;

		a = inputConsole("a");
		b = inputConsole("b");
		c = inputConsole("c");

		intermediateResult = b + Math.sqrt(b * b + 4 * a * c);
		result = intermediateResult / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.println("Result: " + result);
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
