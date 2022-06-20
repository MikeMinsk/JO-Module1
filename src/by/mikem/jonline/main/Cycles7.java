package by.mikem.jonline.main;

import java.util.Scanner;

/*
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 *  m и n вводятся с клавиатуры.
 */

public class Cycles7 {

	public static void main(String[] args) {
		long m;
		long n;

		m = inputConsole("m");

		while (m < 0) {
			m = inputConsole("m");
		}

		n = inputConsole("n");

		while (m >= n || n <= 0) {
			n = inputConsole("n");
		}

		System.out.println("Required numbers and its divisors:");

		for (long number = m; number <= n; number++) {
			System.out.print(number + ": ");
			for (long divisor = 2; divisor < number; divisor++) {
				if (Math.abs(number) % divisor == 0) {
					System.out.print(divisor + ", ");
				}
			}
			System.out.println("");
		}
	}

	public static long inputConsole(String variable) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a value for " + variable + " >> ");

		while (!sc.hasNextLong()) {
			sc.nextLine();
			System.out.print("Enter a value for " + variable + " >> ");
		}

		return sc.nextLong();
	}
}
