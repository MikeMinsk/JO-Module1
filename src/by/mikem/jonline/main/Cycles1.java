package by.mikem.jonline.main;

import java.util.Scanner;

/*
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует 
 * все числа от 1 до введенного пользователем числа.
 */

public class Cycles1 {

	public static void main(String[] args) {
		long x;
		long sum;

		x = inputConsole();
		sum = 0;

		while (x <= 0) {
			x = inputConsole();
		}

		while (x > 0) {
			sum += x--;
		}
		if (sum > 0) {
			System.out.println("Sum of addition: " + sum);
		} else {
			System.out.println("The sum of the addition exceeded the allowable range of numbers");
		}
	}

	public static long inputConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any positive number >> ");

		while (!sc.hasNextLong()) {
			sc.nextLine();
			System.out.print("Enter any positive number >> ");
		}

		return sc.nextLong();
	}
}
