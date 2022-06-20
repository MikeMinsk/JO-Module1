package by.mikem.jonline.main;

import java.util.Scanner;

/*
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
 * то будет ли он прямоугольным. 
 */

public class Branching1 {

	public static void main(String[] args) {
		double firstAngle;
		double secondAngle;
		double anglesSum;

		firstAngle = inputConsole("the first angle");
		while (firstAngle <= 0) {
			firstAngle = inputConsole("the first angle");
		}

		secondAngle = inputConsole("the second angle");
		while (secondAngle <= 0) {
			secondAngle = inputConsole("the second angle");
		}

		anglesSum = firstAngle + secondAngle;

		if (anglesSum < 180) {
			System.out.print("Triangle exists");

			if (anglesSum == 90) {
				System.out.print(" and it is a right triangle");
			}

		} else {
			System.out.print("Triangle does not exist");
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
