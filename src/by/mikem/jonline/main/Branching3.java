package by.mikem.jonline.main;

import java.util.Scanner;

/*
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой. 
 */

public class Branching3 {

	public static void main(String[] args) {
		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;

		x1 = inputConsole("A, x1");
		y1 = inputConsole("A, y1");
		x2 = inputConsole("B, x2");
		y2 = inputConsole("B, y2");
		x3 = inputConsole("C, x3");
		y3 = inputConsole("C, y3");

		if ((y3 - y1) / (y2 - y1) == (x3 - x1) / (x2 - x1)) {
			System.out.println("Points A, B, C lies on the same line");
		} else {
			System.out.println("Points A, B, C does not lie on the same line");
		}
	}

	public static double inputConsole(String variable) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a value for point " + variable + " >> ");

		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Enter a value for point " + variable + " >> ");
		}

		return sc.nextDouble();
	}
}
